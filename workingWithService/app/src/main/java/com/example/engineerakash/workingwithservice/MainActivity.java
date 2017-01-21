package com.example.engineerakash.workingwithservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.simpleservice.simpleServiceStartStopActivity;
import com.example.intent.intentServiceActivityClass;
import com.example.bound.boundServiceActivityClass;

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

    public void intentServiceModule(View view) {
        Intent intentServiceModuleIntent = new Intent(getBaseContext(), intentServiceActivityClass.class);
        startActivity(intentServiceModuleIntent);
    }

    public void boundServiceModule(View view) {
        Intent boundServiceModuleIntent = new Intent(getBaseContext(), boundServiceActivityClass.class);
        startActivity(boundServiceModuleIntent);
    }
}
