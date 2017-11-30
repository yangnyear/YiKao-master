package com.swpuiot.yikao.view.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.presenter.LogInHolder;
import com.swpuiot.yikao.presenter.LogInPresenter;

/**
 * Created by 羊荣毅_L on 2017/4/11.
 */
public class LogInFragment extends Fragment implements View.OnClickListener, LogInHolder.view {
    private EditText userName;
    private EditText passwd;
    private Button logIn;
    private CheckBox remember;
    private TextView lostpasswd;
    private View mView;

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor editor;

    private LogInHolder.presenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_login, container, false);
        }
        inite();
        remenberPassaword();
        return mView;
    }

    private void inite() {
        userName = (EditText) mView.findViewById(R.id.edittext_username);
        passwd = (EditText) mView.findViewById(R.id.edittext_password);
        logIn = (Button) mView.findViewById(R.id.button_login);
        logIn.setOnClickListener(this);
        remember = (CheckBox) mView.findViewById(R.id.box_load);
        lostpasswd = (TextView) mView.findViewById(R.id.text_lost);
        lostpasswd.setOnClickListener(this);

        mPresenter = new LogInPresenter(getActivity(), this);

    }

    public void remenberPassaword() {
        mPreferences = getContext().getSharedPreferences("setting", getContext().MODE_PRIVATE);
        boolean isremenbered = mPreferences.getBoolean("remember_password", false);

        //记住密码
        if (isremenbered) {
            String load_name = mPreferences.getString("name", "");
            String load_password = mPreferences.getString("password", "");
            userName.setText(load_name);
            passwd.setText(load_password);
            remember.setChecked(true);
        }
    }

    public void onLogIn() {
        String name = userName.getText().toString().trim();
        String password = passwd.getText().toString().trim();
        editor = mPreferences.edit();
        //首先检查是否记住了密码
        if (remember.isChecked()) {
            editor.putBoolean("remember_password", true);
            editor.putString("name", name);
            editor.putString("password", password);
        } else {
            editor.clear();
        }
        editor.apply();
       if (name.equals("")){
           Toast.makeText(getContext(),"请输入账号",Toast.LENGTH_SHORT).show();
           return;
       }
        if (password.equals("")){
            Toast.makeText(getContext(),"请输入密码",Toast.LENGTH_SHORT).show();
            return;

        }
           mPresenter.logIn(name, password);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_login:
                onLogIn();
                break;
            case R.id.text_lost:
                // TODO: 2017/4/23
                break;
        }
    }
}
