package com.android.szss.a1builder;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AlertDialog.Builder(this)
                .setTitle("123")
                .setMessage("test")
                .create()
                .show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.show();

    }
}
