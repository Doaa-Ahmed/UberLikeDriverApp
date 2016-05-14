package com.example.hp.uberdriver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

public class GCMReceiver extends WakefulBroadcastReceiver{
    public GCMReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        ComponentName comp_name = new ComponentName(context.getPackageName(), GCMListener.class.getName());
        startWakefulService(context, (intent.setComponent(comp_name)));
        setResultCode(Activity.RESULT_OK);
    }
}
