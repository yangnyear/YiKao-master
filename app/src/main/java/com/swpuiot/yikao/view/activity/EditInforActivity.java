package com.swpuiot.yikao.view.activity;

import android.app.AlertDialog;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;

import java.io.File;
import java.io.IOException;

public class EditInforActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int TAKE_PHOTO = 1;
    public static final int GCOP_PHOTO = 2;
    public static final int CHOOSE_PHOTO = 3;
    private EditText editName;
    private SimpleDraweeView editLogo;
    private AlertDialog dialog;
    private Uri imageuri;
    private LayoutInflater inflater;
    private TextView sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_edit_infor);
        initer();
    }

    private void initer() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_edit));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.ll).requestFocus();

        inflater = LayoutInflater.from(EditInforActivity.this);

        editName = (EditText) findViewById(R.id.ed_name);
        editLogo = (SimpleDraweeView) findViewById(R.id.sim_edit_logo);
        findViewById(R.id.tt_save).setOnClickListener(this);
        findViewById(R.id.ll_edit_logo).setOnClickListener(this);
        findViewById(R.id.ll_edit_sex).setOnClickListener(this);
        findViewById(R.id.ll_edit_age).setOnClickListener(this);
        findViewById(R.id.ll_edit_birthday).setOnClickListener(this);
        findViewById(R.id.ll_edit_start).setOnClickListener(this);
        sex = (TextView) findViewById(R.id.tt_edit_user_sex);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_edit_logo:
                onEditLogoClicked();
                break;
            case R.id.ll_edit_sex:
                selecteSex();
                break;
            case R.id.ll_edit_birthday:
                break;
            case R.id.ll_edit_start:
                // TODO: 2017/4/24
                break;
            case R.id.tt_save:
                // TODO: 2017/4/24
                break;
            case R.id.tt_open_camera:
                openCamera(TAKE_PHOTO);
                break;
            case R.id.tt_select_from_photo_album:
                openPhotoHome(CHOOSE_PHOTO);
                break;
            case R.id.tt_check_logo:
                // TODO: 2017/4/24
                break;
            case R.id.tt_choose_sex_boy:
                dialog.dismiss();
                sex.setText("男");

                break;
            case R.id.tt_choose_sex_girl:
                dialog.dismiss();
                sex.setText("女");
                break;
        }
    }

    public void onEditLogoClicked() {
        View view = inflater.inflate(R.layout.layout_choose_logo, null, false);
        dialog = new AlertDialog
                .Builder(EditInforActivity.this)
                .setView(view)
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
        view.findViewById(R.id.tt_open_camera).setOnClickListener(EditInforActivity.this);
        view.findViewById(R.id.tt_select_from_photo_album).setOnClickListener(EditInforActivity.this);
        view.findViewById(R.id.tt_check_logo).setOnClickListener(EditInforActivity.this);
    }

    //打开相机拍照
    public void openCamera(int a) {
        File outputimage = new File(Environment.getExternalStorageDirectory(), "tempimage.jpg");

        try {
            if (outputimage.exists()) {
                outputimage.delete();
            }
            outputimage.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageuri = Uri.fromFile(outputimage);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageuri);
        startActivityForResult(intent, a);
    }

    //打开相册选择照片
    public void openPhotoHome(int a) {
        File outPutImage = new File(Environment.getExternalStorageDirectory(), "out_put.jpg");
        try {
            if (outPutImage.exists()) {
                outPutImage.delete();
            }
            outPutImage.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageuri = Uri.fromFile(outPutImage);
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent, a);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String imagePath;
        switch (requestCode) {
            case TAKE_PHOTO:
                if (resultCode == RESULT_OK) {
                    Intent intent = new Intent("com.android.camera.action.CROP");
                    intent.setDataAndType(imageuri, "image/*");
                    intent.putExtra("scale", true);
                    intent.putExtra(MediaStore.EXTRA_OUTPUT, imageuri);
                    startActivityForResult(intent, GCOP_PHOTO);
                }
                break;
            case GCOP_PHOTO:
                if (resultCode == RESULT_OK) {
                    if (dialog != null && dialog.isShowing()) dialog.dismiss();
                    editLogo.setImageURI(imageuri);

                }
                break;
            case CHOOSE_PHOTO:
                if (resultCode == RESULT_OK) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        imagePath = handleImageOnkitkat(data);
                        resettingUserLogo(imagePath);

                    } else {
                        imagePath = handleimageBefokitkat(data);
                        resettingUserLogo(imagePath);
                    }
                }
            default:
                break;
        }
    }

    private String handleimageBefokitkat(Intent data) {
        Uri uri = data.getData();
        String imagepath = getimagepath(uri, null);
        displayimage(imagepath);
        return imagepath;
    }

    private String getimagepath(Uri uri, String selection) {
        String path = null;
        Cursor cursor = getContentResolver().query(uri, null, selection, null, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                path = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));
            }
            cursor.close();
        }
        return path;
    }

    private void displayimage(String imagepath) {
        if (imagepath != null) {
            if (dialog != null && dialog.isShowing()) dialog.dismiss();
            String uri = "file://" + imagepath;
            editLogo.setImageURI(Uri.parse(uri));
        } else {
            Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
        }
    }

    private String handleImageOnkitkat(Intent data) {
        String imagepath = null;
        Uri uri = data.getData();
        if (DocumentsContract.isDocumentUri(this, uri)) {
            String docid = DocumentsContract.getDocumentId(uri);
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String id = docid.split(":")[1];
                String selection = MediaStore.Images.Media._ID + "=" + id;
                imagepath = getimagepath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, selection);
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                Uri contentUri = ContentUris.withAppendedId(uri.parse("content://downloads/public_downloads"),
                        Long.valueOf(docid));
                imagepath = getimagepath(contentUri, null);
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            imagepath = getimagepath(uri, null);
        }
        displayimage(imagepath);
        return imagepath;
    }

    public void resettingUserLogo(String imagePath) {
        File imageFile = new File(imagePath);
        // TODO: 2017/4/24
    }

    public void selecteSex() {
        View view = inflater.inflate(R.layout.layout_choose_sex, null, false);
        dialog = new AlertDialog
                .Builder(EditInforActivity.this)
                .setView(view)
                .show();
        view.findViewById(R.id.tt_choose_sex_boy).setOnClickListener(EditInforActivity.this);
        view.findViewById(R.id.tt_choose_sex_girl).setOnClickListener(EditInforActivity.this);
    }

}
