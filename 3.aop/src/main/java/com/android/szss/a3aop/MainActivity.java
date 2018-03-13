package com.android.szss.a3aop;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.szss.a3aop.annotation.BehaviorTrace;
import com.android.szss.a3aop.annotation.UserBehaviorTrace;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button yaoyiyaoBtn;
    private Button videoBtn;
    private Button messageBtn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yaoyiyaoBtn = findViewById(R.id.btn_yaoyiyao);
        videoBtn = findViewById(R.id.btn_video);
        messageBtn = findViewById(R.id.btn_message);

        yaoyiyaoBtn.setOnClickListener(this);
        videoBtn.setOnClickListener(this);
        messageBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yaoyiyao:
                shakeAction();
                break;
            case R.id.btn_video:
                videoAction();
                break;
            case R.id.btn_message:
                messageAction();
                break;
        }
    }

    @BehaviorTrace("摇一摇")
    private void shakeAction() {
        SystemClock.sleep(new Random().nextInt(1000));
    }

    @BehaviorTrace("发视频")
    private void videoAction() {
        SystemClock.sleep(new Random().nextInt(1000));
    }

    @UserBehaviorTrace("发说说")
    private void messageAction() {
        SystemClock.sleep(new Random().nextInt(1000));
    }

}
