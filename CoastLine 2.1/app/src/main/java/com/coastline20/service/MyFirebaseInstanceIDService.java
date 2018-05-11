package com.coastline20.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import com.coastline20.config.Config;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService  extends FirebaseInstanceIdService {
    private static final String TAG = MyFirebaseInstanceIDService.class.getSimpleName();

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        storeRegIdInPref(refreshedToken);
        sendRegistrationToServer(refreshedToken);
        Intent intent = new Intent(Config.REGISTRATION_COMPLETE);
        intent.putExtra("token", refreshedToken);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private void sendRegistrationToServer(String refreshedToken) {
        Log.e(TAG, "SendRegistrationToServer：" + refreshedToken);
    }

    private void storeRegIdInPref(String refreshedToken) {
        SharedPreferences preferences = getApplicationContext().getSharedPreferences(Config.SHARED_PREF, 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("regId", refreshedToken);
        editor.commit();
    }
}