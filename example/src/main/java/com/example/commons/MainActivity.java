package com.example.commons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hendraanggrian.commons.view.ViewGroups;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout parent = (LinearLayout) findViewById(R.id.parent);

        TextView textView = ViewGroups.addView(parent, TextView.class, ViewGroups.MATCH_PARENT, ViewGroups.MATCH_PARENT);
        textView.setText("Hello world");
    }
}