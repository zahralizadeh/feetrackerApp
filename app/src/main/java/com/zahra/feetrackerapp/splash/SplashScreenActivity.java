package com.zahra.feetrackerapp.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.zahra.feetrackerapp.R;
import com.zahra.feetrackerapp.login.LoginActivity;
import com.zahra.feetrackerapp.utils.views.myRegularText;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final myRegularText logo = findViewById(R.id.logo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                logo.setVisibility(View.VISIBLE);
            }
        }, 1000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent go_login = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(go_login);
            }
        }, 4000);
    }
}
