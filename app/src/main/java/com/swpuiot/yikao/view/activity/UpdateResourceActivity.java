package com.swpuiot.yikao.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.presenter.UpdateResourceHolder;
import com.swpuiot.yikao.presenter.UpdateResourcePresenter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UpdateResourceActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener, UpdateResourceHolder.view {
    public static final int openFilemanegger = 1;
    private Spinner academyspinner;
    private Spinner gradeSpinner;
    private ArrayAdapter<String> academyAdapter;
    private ArrayAdapter<String> depatmentAdapter;
    private String academyString;
    private String depatmentString;
    private UpdateResourceHolder.presenter mPresenter;
    private TextView fileName;
    private TextView fileProduce;
    private TextView fileExcept;
    private Button delateFile;
    private File file;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_update_resource);
        inite();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mPresenter = new UpdateResourcePresenter(this);
        setAcademySpinnerAdapter(academyspinner);
        setGradeSpinnerAdapter(gradeSpinner);
        fileName.setOnClickListener(this);
        findViewById(R.id.tt_send_file).setOnClickListener(this);
    }

    private void inite() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_update_resource));
        academyspinner = (Spinner) findViewById(R.id.spinner_academy);
        gradeSpinner = (Spinner) findViewById(R.id.spinner_grade);
        fileName = (TextView) findViewById(R.id.tt_file_name);
        delateFile = (Button) findViewById(R.id.btn_removefile);
        fileProduce = (TextView) findViewById(R.id.tt_file_information);
        fileExcept = (TextView) findViewById(R.id.tt_file_course_namee);

    }

    private void setAcademySpinnerAdapter(Spinner spinner) {
        List<String> academyList = new ArrayList<>();
        mPresenter.loadStringContent(academyList);
        academyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, academyList);
        academyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(academyAdapter);

    }

    private void setGradeSpinnerAdapter(Spinner spinner) {
        List<String> gradList = new ArrayList<>();
        mPresenter.loadGradeList(gradList);
        depatmentAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gradList);
        depatmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(depatmentAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        academyString = academyAdapter.getItem(position);
        depatmentString = depatmentAdapter.getItem(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tt_file_name:
                openFileManegger(openFilemanegger);
                break;
            case R.id.tt_send_file:
                onFileSend();
                break;
        }
    }

    public void onFileSend() {
        String Name = fileName.getText().toString().trim();
        String produce = fileProduce.getText().toString().trim();
        String except = fileExcept.getText().toString().trim();
        if (Name.equals("")) {
            Toast.makeText(UpdateResourceActivity.this, "请选择文件", Toast.LENGTH_SHORT).show();
            return;
        }
        if (produce.equals("")) {
            Toast.makeText(UpdateResourceActivity.this, "请填写文件简介", Toast.LENGTH_SHORT).show();
            return;
        }
        if (except.equals("")) {
            Toast.makeText(UpdateResourceActivity.this, "请填写文件所属科目", Toast.LENGTH_SHORT).show();
            return;
        }
        mPresenter.SendFile(Name, produce, academyString, depatmentString, except);
    }

    //添加附件
    public void openFileManegger(int statusCoode) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        //设置类型，我这里是任意类型，任意后缀的可以这样写。
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent, statusCoode);
    }

    //获得文件后返回Activity.RESULT_OK
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK) {//是否选择，没选择就不会继续
            Uri uri = data.getData();//得到uri，后面就是将uri转化成file的过程。
            String file_path = uri.getPath();
            file = new File(file_path);
            //将文件信息显示在文件列表中
            Toast.makeText(UpdateResourceActivity.this, "点击上传提交文件: " + file.getName(), Toast.LENGTH_SHORT).show();
            delateFile.setVisibility(View.VISIBLE);
            fileName.setText(file.getName());
            mPresenter.bindFile(file);
        }
    }
}
