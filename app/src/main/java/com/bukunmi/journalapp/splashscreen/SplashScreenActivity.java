package com.bukunmi.journalapp.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bukunmi.journalapp.account.SignInActivity;
import com.bukunmi.journalapp.main.MainActivity;

public class SplashScreenActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sendToMain();
    }

    private void sendToMain() {
        Intent mainActivityIntent = new Intent(SplashScreenActivity.this, SignInActivity.class);
        startActivity(mainActivityIntent);
        finish();
    }

}
