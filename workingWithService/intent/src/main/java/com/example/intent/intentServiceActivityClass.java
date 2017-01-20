package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class intentServiceActivityClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_service_activity_class);
    }

    public void startIntentService(View view) {
        Intent intentServiceStartIntent =  new Intent(getBaseContext(), intentServiceExtendedClass.class);
        startService(intentServiceStartIntent);
    }
}
