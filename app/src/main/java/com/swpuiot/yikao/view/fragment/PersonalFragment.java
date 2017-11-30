package com.swpuiot.yikao.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;
import com.swpuiot.yikao.presenter.PerSonalHolder;
import com.swpuiot.yikao.presenter.PersonalPresent;
import com.swpuiot.yikao.view.activity.LoginActivity;
import com.swpuiot.yikao.view.activity.UpdateResourceActivity;
import com.swpuiot.yikao.view.activity.UserInformationActivity;

/**
 * Created by 羊荣毅_L on 2017/3/29.
 * 个人主页
 */
public class PersonalFragment extends Fragment implements PerSonalHolder.view, View.OnClickListener {
    private PerSonalHolder.present mPresent;
    private SimpleDraweeView mLogo;
    private TextView mProfession;
    private TextView other;
    private View mView;
    private Intent intent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_personal, container, false);
        }
        inite();
        mLogo.setOnClickListener(this);
        return mView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    private void inite() {
        mPresent = new PersonalPresent(getActivity(), this);
        mLogo = (SimpleDraweeView) mView.findViewById(R.id.image_userlogo);
        mProfession = (TextView) mView.findViewById(R.id.text_user_name);
        other = (TextView) mView.findViewById(R.id.text_user_other);
        mView.findViewById(R.id.ll_personal_user_information).setOnClickListener(this);
        mView.findViewById(R.id.ll_personal_downloads).setOnClickListener(this);
        mView.findViewById(R.id.ll_personal_update).setOnClickListener(this);
        mView.findViewById(R.id.ll_personal_text).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.ll_personal_user_information:
                intent = new Intent(getContext(), UserInformationActivity.class);
                mPresent.startActivity(intent);
                break;
            case R.id.ll_personal_downloads:
                // TODO: 2017/4/9
                break;
            case R.id.ll_personal_update:
                intent = new Intent(getContext(), UpdateResourceActivity.class);
                mPresent.startActivity(intent);
                break;
            case R.id.ll_personal_text:
                // TODO: 2017/4/9
                break;
            case R.id.image_userlogo:
                intent = new Intent(getContext(), LoginActivity.class);
                mPresent.startActivity(intent);
                break;

        }
    }

    @Override
    public void myStartActivity(Intent intent) {
        startActivity(intent);
    }
}
