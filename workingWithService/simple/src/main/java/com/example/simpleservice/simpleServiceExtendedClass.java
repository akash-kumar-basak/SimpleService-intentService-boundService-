package com.example.simpleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class simpleServiceExtendedClass extends Service {
    public simpleServiceExtendedClass() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(simpleServiceExtendedClass.this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public void numberCount()
    {
        for(int i = 0; i <= 5; i++)
        {
            switch (i)
            {
                case 0:
                {
                    Toast.makeText(simpleServiceExtendedClass.this, "one", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 1:
                {
                    Toast.makeText(simpleServiceExtendedClass.this, "two", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 2:
                {
                    Toast.makeText(simpleServiceExtendedClass.this, "three", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 3:
                {
                    Toast.makeText(simpleServiceExtendedClass.this, "four", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 4:
                {
                    Toast.makeText(simpleServiceExtendedClass.this, "five", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 5:
                {
                    Toast.makeText(simpleServiceExtendedClass.this, "no more number available", Toast.LENGTH_SHORT).show();
                    break;
                }
                default:
                {
                    Toast.makeText(simpleServiceExtendedClass.this, "one", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        numberCount();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(simpleServiceExtendedClass.this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
