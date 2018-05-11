package com.coastline20.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.coastline20.R;

public class WelcomeActivity extends AppCompatActivity {
    private boolean isClick = true;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        toast = Toast.makeText(this, "載入中", Toast.LENGTH_SHORT);
        toast.show();
        // 3秒跳轉
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isClick) {
                    startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
                    finish();
                }
            }
        }, 3000);
    }

    // 點擊跳轉
    public void welcome_btn(View view) {
        isClick = false;
        startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        toast.cancel();
        finish();
    }
}
