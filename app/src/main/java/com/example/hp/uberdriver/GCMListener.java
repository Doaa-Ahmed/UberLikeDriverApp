package com.example.hp.uberdriver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class GCMListener extends Service {
    public GCMListener() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
