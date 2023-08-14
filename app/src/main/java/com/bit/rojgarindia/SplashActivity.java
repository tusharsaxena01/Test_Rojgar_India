package com.bit.rojgarindia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sp = getSharedPreferences("data", 0);
        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        if(sp.getBoolean("firstVisit", true)){
                            startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
                            finish();
                        }
//                        else{
//                            startActivity(new Intent(getApplicationContext(), NavigationActivity.class));
//                        }
                    }
                }, 3000);
    }
}