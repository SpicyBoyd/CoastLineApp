package com.coastline20.activity.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.coastline20.R;
import com.coastline20.activity.MainActivity;
import com.coastline20.config.Config;
import com.coastline20.util.NotificationUtils;
import com.google.firebase.messaging.FirebaseMessaging;

public class Notifications extends AppCompatActivity {
    // BUG 1：MainActivity
    private static final String TAG = MainActivity.class.getSimpleName();
    private BroadcastReceiver broadcastReceiver;
    private TextView textMessage, textRegId;

    private void init() {
        textRegId = (TextView) findViewById(R.id.txt_reg_id);
        textMessage = (TextView) findViewById(R.id.txt_push_message);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        init();
        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals(Config.REGISTRATION_COMPLETE)) {
                    FirebaseMessaging.getInstance().subscribeToTopic(Config.TOPIC_GLOBAL);
                    displayFirebaseRegId();
                } else if (intent.getAction().equals(Config.PUSH_NOTIFICATION)) {
                    String message = intent.getStringExtra("message");
                    Toast.makeText(getApplicationContext(), "Push notifications!" + message, Toast.LENGTH_LONG).show();
                    textMessage.setText(message);
                }
            }
        };
        displayFirebaseRegId();
    }

    private void displayFirebaseRegId() {
        SharedPreferences preferences = getApplicationContext().getSharedPreferences(Config.SHARED_PREF, 0);
        String regId = preferences.getString("redId", null);
        Log.e(TAG, "Firebase reg id：" + regId);
        // BUG 2：缺!
        if (!TextUtils.isEmpty(regId)) {
            textRegId.setText("Firebase reg id：" + regId);
        }else {
            textRegId.setText("Firebase reg id is not received yet!");
        }
    }

    @Override
    protected void onPause() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // register GCM registration complete receiver
        LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver,
                new IntentFilter(Config.REGISTRATION_COMPLETE));

        // register new push message receiver
        // by doing this, the activity will be notified each time a new message arrives
        LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver,
                new IntentFilter(Config.PUSH_NOTIFICATION));

        // clear the notification area when the app is opened
        // getApplicationContext()
        NotificationUtils.clearNotifications(getApplication());
    }
}
