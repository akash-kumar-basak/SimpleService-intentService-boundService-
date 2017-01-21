package com.example.bound;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class boundServiceActivityClass extends AppCompatActivity {

    boundServiceExtendedBinderClass service = null;
    boolean isBound = false;

    ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            service = ((boundServiceExtendedBinderClass.myBinder) iBinder).getMyservice();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            service = null;
            isBound = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service_activity_class);
    }

    @Override
    protected void onStart() {
        super.onStart();
            Intent intent = new Intent(getBaseContext(), boundServiceExtendedBinderClass.class);
            bindService(intent, connection, BIND_AUTO_CREATE);

    }

    @Override
    protected void onStop() {
        super.onStop();
        if (isBound)
        {
            unbindService(connection);
        }
    }

    public void sumShow(View view) {
        if (isBound)
        {
            service.any();
        }
    }

    public void boundServiceStart(View view) {
        service.numberCount();
    }
}
