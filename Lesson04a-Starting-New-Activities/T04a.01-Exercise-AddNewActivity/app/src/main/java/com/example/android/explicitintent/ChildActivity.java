package com.example.android.explicitintent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends Activity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mText = (TextView) findViewById(R.id.tv_display);
    }
}
