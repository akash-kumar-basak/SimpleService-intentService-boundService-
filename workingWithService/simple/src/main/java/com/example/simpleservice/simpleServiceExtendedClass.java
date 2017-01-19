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
    public void simpleString()
    {
        String simpleText = "simple service module";
        Toast.makeText(simpleServiceExtendedClass.this, simpleText, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        simpleString();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(simpleServiceExtendedClass.this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
