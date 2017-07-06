package com.hendraanggrian.support.utils.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.ProgressBar;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public class ViewGroupsActivity extends AppCompatActivity {

    public ProgressBar progressBar;
    public ViewGroup container;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewgroups);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        container = (ViewGroup) findViewById(R.id.container);
    }
}