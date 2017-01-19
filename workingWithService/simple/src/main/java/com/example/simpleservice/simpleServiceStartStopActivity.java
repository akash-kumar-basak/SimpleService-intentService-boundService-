package com.example.simpleservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class simpleServiceStartStopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_service_start_stop);
    }

    public void simpleServiceStart(View view) {
        Intent start = new Intent(getBaseContext(), simpleServiceExtendedClass.class);
        startService(start);
    }

    public void simpleServiceStop(View view) {
        Intent stop = new Intent(getBaseContext(), simpleServiceExtendedClass.class);
        stopService(stop);
    }
}
