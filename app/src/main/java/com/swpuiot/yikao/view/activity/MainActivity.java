package com.swpuiot.yikao.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.RadioGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.nineoldandroids.animation.ObjectAnimator;
import com.swpuiot.yikao.R;
import com.swpuiot.yikao.presenter.MainHolder;
import com.swpuiot.yikao.presenter.MainPresenter;
import com.swpuiot.yikao.view.fragment.HomePageFragment;
import com.swpuiot.yikao.view.fragment.PersonalFragment;
import com.swpuiot.yikao.view.fragment.ResourceFragment;
import com.swpuiot.yikao.view.fragment.SomeBodyFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainHolder.view {
    private MainHolder.presenter mPresenter;

    private HomePageFragment mHomePageFragment;
    private ResourceFragment mZhiLiaoFragment;
    private SomeBodyFragment mXuanShangFragment;
    private PersonalFragment mPersonalFragment;

    private RadioGroup mRadioGroup;
    private FragmentManager mFragmentManager;
    private ObjectAnimator mAnimator;
    private Boolean isScoller = false;

    private View addView;
    private View ReLAddView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(MainActivity.this);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        inite();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void inite() {
        mPresenter = new MainPresenter(this);

        mRadioGroup = (RadioGroup) findViewById(R.id.rdg_main);
        findViewById(R.id.rdb_homepage).setOnClickListener(this);
        findViewById(R.id.rdb_ziliao).setOnClickListener(this);
        addView = findViewById(R.id.rdb_add);
        addView.setOnClickListener(this);
        findViewById(R.id.rdb_xuanshang).setOnClickListener(this);
        findViewById(R.id.rdb_personal).setOnClickListener(this);
        ReLAddView = findViewById(R.id.rl_add_view);

        findViewById(R.id.ll_update_resource).setOnClickListener(this);
        findViewById(R.id.ll_add_somebody).setOnClickListener(this);
        findViewById(R.id.ll_write_blog).setOnClickListener(this);

        findViewById(R.id.ll_update_resource).setOnClickListener(this);
        findViewById(R.id.ll_add_somebody).setOnClickListener(this);
        findViewById(R.id.ll_write_blog).setOnClickListener(this);

        //初始化fragment
        mHomePageFragment = new HomePageFragment();
        mZhiLiaoFragment = new ResourceFragment();
        mXuanShangFragment = new SomeBodyFragment();
        mPersonalFragment = new PersonalFragment();

        mFragmentManager = getSupportFragmentManager();
        mRadioGroup.check(R.id.rdb_homepage);
        mFragmentManager.beginTransaction()
                .add(R.id.fl_fragmentcontener, mHomePageFragment)
                .add(R.id.fl_fragmentcontener, mZhiLiaoFragment)
                .add(R.id.fl_fragmentcontener, mXuanShangFragment)
                .add(R.id.fl_fragmentcontener, mPersonalFragment).commit();
        mPresenter.showHomePageFragment();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rdb_homepage:
                mPresenter.showHomePageFragment();
                break;
            case R.id.rdb_ziliao:
                mPresenter.showHResourceFragment();
                break;
            case R.id.rdb_add:
                if (!isScoller) {
                    mPresenter.startAnimator();
                    ReLAddView.setVisibility(View.VISIBLE);
                    isScoller = true;
                } else if (isScoller) {
                    mPresenter.animatorResume();
                    ReLAddView.setVisibility(View.INVISIBLE);
                    isScoller = false;
                }
                break;
            case R.id.rdb_xuanshang:
                mPresenter.showSomeBodyFragment();
                break;
            case R.id.rdb_personal:
                mPresenter.showPersonalFragment();
                break;
            case R.id.ll_update_resource:
                Intent intent=new Intent(MainActivity.this,UpdateResourceActivity.class);
                startActivity(intent);
                break;
            case R.id.ll_add_somebody:
                // TODO: 2017/4/23
                break;

            case R.id.ll_write_blog:
                // TODO: 2017/4/23
                break;

        }
    }

    @Override
    public void showHomePageFragment() {
        mFragmentManager.beginTransaction()
                .hide(mZhiLiaoFragment)
                .hide(mXuanShangFragment)
                .hide(mPersonalFragment)
                .show(mHomePageFragment).commit();
    }

    @Override
    public void showPersonalFragment() {
        mFragmentManager.beginTransaction()
                .hide(mHomePageFragment)
                .hide(mZhiLiaoFragment)
                .hide(mXuanShangFragment)
                .show(mPersonalFragment).commit();
    }

    @Override
    public void showHResourceFragment() {
        mFragmentManager.beginTransaction()
                .hide(mHomePageFragment)
                .hide(mXuanShangFragment)
                .hide(mPersonalFragment)
                .show(mZhiLiaoFragment).commit();
    }

    @Override
    public void showSomeBodyFragment() {
        mFragmentManager.beginTransaction()
                .hide(mHomePageFragment)
                .hide(mZhiLiaoFragment)
                .hide(mPersonalFragment)
                .show(mXuanShangFragment).commit();
    }

    @Override
    public void startAnimator() {
        mAnimator = ObjectAnimator.ofFloat(addView, "rotation", 0, 495)
                .setDuration(500);
        mAnimator.start();
    }

    @Override
    public void animatorResume() {
        mAnimator = ObjectAnimator.ofFloat(addView, "rotation", 0, -450);
        mAnimator.setCurrentPlayTime(500);
        mAnimator.start();
    }
}
