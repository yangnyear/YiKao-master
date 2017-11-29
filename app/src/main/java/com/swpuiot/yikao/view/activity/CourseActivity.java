package com.swpuiot.yikao.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.swpuiot.yikao.R;

public class CourseActivity extends AppCompatActivity {
    private TextView courseName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        courseName= (TextView) findViewById(R.id.tt_coursname);
        //取得从上一个Activity当中传递过来的Intent对象
        Intent _intent = getIntent();
        //从Intent当中根据key取得value
        if (_intent != null) {
            String course_name = _intent.getStringExtra("courseName");
            courseName.setText(course_name);
        }
    }
}
