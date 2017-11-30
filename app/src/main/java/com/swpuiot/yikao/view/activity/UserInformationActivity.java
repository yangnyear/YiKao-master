package com.swpuiot.yikao.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.presenter.UserInformationHolder;

public class UserInformationActivity extends AppCompatActivity implements UserInformationHolder.view ,View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_user_information);
        inite();
    }
    private void inite(){
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_user_information));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.tt_edite).setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tt_edite:
                Intent intent=new Intent(UserInformationActivity.this,EditInforActivity.class);
                startActivity(intent);
                break;

        }
    }
}
