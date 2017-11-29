package com.swpuiot.yikao.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.nineoldandroids.animation.ObjectAnimator;
import com.swpuiot.yikao.R;
import com.swpuiot.yikao.view.fragment.LogInFragment;
import com.swpuiot.yikao.view.fragment.SetFragment;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private LogInFragment mLogInFragment;
    private SetFragment mSetFragment;
    private FragmentManager mFragmentManager;
    private ObjectAnimator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        inite();
        if (mFragmentManager == null) {
            mSetFragment = new SetFragment();
            mLogInFragment = new LogInFragment();
            mFragmentManager = getSupportFragmentManager();
            mFragmentManager.beginTransaction()
                    .add(R.id.ll_log_reset, mLogInFragment)
                    .add(R.id.ll_log_reset, mSetFragment)
                    .commit();
        }
        showLogoFragment();
    }

    private void inite() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_login));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.tt_logoin).setOnClickListener(this);
        findViewById(R.id.tt_reset).setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tt_logoin:
                showLogoFragment();
                break;
            case R.id.tt_reset:
                showSetFragment();
                break;

        }
    }

    private void showLogoFragment() {
        mFragmentManager.beginTransaction()
                .hide(mSetFragment)
                .show(mLogInFragment).commit();
    }

    private void showSetFragment() {
        mFragmentManager.beginTransaction()
                .hide(mLogInFragment)
                .show(mSetFragment).commit();
    }
}
