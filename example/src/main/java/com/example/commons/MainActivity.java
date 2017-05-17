package com.example.commons;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hendraanggrian.compat.text.Spans;
import com.hendraanggrian.compat.view.ViewGroups;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout parent = (LinearLayout) findViewById(R.id.parent);
        TextView textView = ViewGroups.addView(parent, TextView.class, ViewGroups.WRAP_CONTENT, ViewGroups.WRAP_CONTENT);
        /*textView.setText(new Spans.Builder("Hello ")
                .append("World!", Spannable.SPAN_EXCLUSIVE_EXCLUSIVE, new ForegroundColorSpan(Color.BLUE), new RelativeSizeSpan(6))
                .build());*/
        textView.setText(Spans.format("Hello %s! My name is %s %s",
                Spans.of("World", new ForegroundColorSpan(Color.BLUE), new RelativeSizeSpan(6)),
                Spans.of("Hendra", new ForegroundColorSpan(Color.RED)),
                Spans.of("Anggrian", new ForegroundColorSpan(Color.GREEN))));
    }
}