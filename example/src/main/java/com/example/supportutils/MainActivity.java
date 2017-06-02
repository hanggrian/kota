package com.example.supportutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hendraanggrian.support.utils.view.ViewGroups;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout parent = (LinearLayout) findViewById(R.id.parent);
        TextView textView = ViewGroups.addView(parent, TextView.class, ViewGroups.WRAP_CONTENT, ViewGroups.WRAP_CONTENT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}