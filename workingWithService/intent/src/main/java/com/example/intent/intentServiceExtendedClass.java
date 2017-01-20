package com.example.intent;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

public class intentServiceExtendedClass extends IntentService {

    public intentServiceExtendedClass() {
        super("intentServiceExtendedClass");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(intentServiceExtendedClass.this, "onCreate", Toast.LENGTH_SHORT).show();
    }
    public void numberCount()
    {
        for(int i = 0; i <= 5; i++)
        {
            switch (i)
            {
                case 0:
                {
                    Toast.makeText(intentServiceExtendedClass.this, "one", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 1:
                {
                    Toast.makeText(intentServiceExtendedClass.this, "two", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 2:
                {
                    Toast.makeText(intentServiceExtendedClass.this, "three", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 3:
                {
                    Toast.makeText(intentServiceExtendedClass.this, "four", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 4:
                {
                    Toast.makeText(intentServiceExtendedClass.this, "five", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 5:
                {
                    Toast.makeText(intentServiceExtendedClass.this, "no more number available", Toast.LENGTH_SHORT).show();
                    break;
                }
                default:
                {
                    Toast.makeText(intentServiceExtendedClass.this, "one", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                numberCount();
            }
        });
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(intentServiceExtendedClass.this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
