package com.example.juantorres.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Juan Torres on 1/27/2015.
 */
public class HelloBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
Log.d("Broadcast Receiver","Power is connected");
    }
}
