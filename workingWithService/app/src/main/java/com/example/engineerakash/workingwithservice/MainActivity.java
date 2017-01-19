package com.example.engineerakash.workingwithservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.simpleservice.simpleServiceStartStopActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleServiceModule(View view) {
        Intent simpleServiceModuelIntent = new Intent(getApplicationContext(), simpleServiceStartStopActivity.class);
        startActivity(simpleServiceModuelIntent);
}
}
