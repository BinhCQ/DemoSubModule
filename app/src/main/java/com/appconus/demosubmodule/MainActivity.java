package com.appconus.demosubmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvFoo = (TextView) findViewById(R.id.tvFoo);
//        tvFoo.setText(Foo.ping());
    }
}