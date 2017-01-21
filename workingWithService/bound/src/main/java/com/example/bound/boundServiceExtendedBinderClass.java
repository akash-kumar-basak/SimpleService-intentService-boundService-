package com.example.bound;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class boundServiceExtendedBinderClass extends Service {
    public boundServiceExtendedBinderClass() {
    }

    myBinder myBinderRefference = new myBinder();

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(boundServiceExtendedBinderClass.this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myBinderRefference;
    }
    public class myBinder extends Binder{
        boundServiceExtendedBinderClass getMyservice(){
            return boundServiceExtendedBinderClass.this;
        }
    }

    public void any()
    {
        Toast.makeText(boundServiceExtendedBinderClass.this, "hello bound service", Toast.LENGTH_SHORT).show();
    }
    public void numberCount()
    {
        for(int i = 0; i <= 5; i++)
        {
            switch (i)
            {
                case 0:
                {
                    Toast.makeText(boundServiceExtendedBinderClass.this, "one", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 1:
                {
                    Toast.makeText(boundServiceExtendedBinderClass.this, "two", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 2:
                {
                    Toast.makeText(boundServiceExtendedBinderClass.this, "three", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 3:
                {
                    Toast.makeText(boundServiceExtendedBinderClass.this, "four", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 4:
                {
                    Toast.makeText(boundServiceExtendedBinderClass.this, "five", Toast.LENGTH_SHORT).show();
                    break;
                }
                case 5:
                {
                    Toast.makeText(boundServiceExtendedBinderClass.this, "no more number available", Toast.LENGTH_SHORT).show();
                    break;
                }
                default:
                {
                    Toast.makeText(boundServiceExtendedBinderClass.this, "one", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(boundServiceExtendedBinderClass.this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
