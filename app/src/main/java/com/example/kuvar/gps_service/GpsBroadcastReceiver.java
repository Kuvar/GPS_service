package com.example.kuvar.gps_service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class GpsBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Coordinates : " + intent.getStringExtra("coordinates"),Toast.LENGTH_LONG).show();
    }
}
