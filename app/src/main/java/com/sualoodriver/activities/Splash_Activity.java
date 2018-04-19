package com.sualoodriver.activities;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sualoodriver.R;

public class Splash_Activity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        if (isOnline()){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

//                    SharedPreferences sharedpreference_splash = getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE);
//
//                    if (sharedpreference_splash.getString("user_id", "").equals("")){
//                        startActivity(new Intent(Splash_Activity.this,Login_Activity.class));
//                        finish();
//                    }else {
//                        startActivity(new Intent(Splash_Activity.this,MainActivity.class));
//                        finish();
//                    }

                    Intent intent = new Intent(Splash_Activity.this, Login_Activity.class);
                    startActivity(intent);
                    finish();

                }
            }, SPLASH_TIME_OUT);
        }else{
            Toast.makeText(Splash_Activity.this, "There are no internet connection", Toast.LENGTH_LONG).show();
            Thread timerThread = new Thread() {
                public void run() {
                    try {
                        sleep(SPLASH_TIME_OUT);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        finish();
                    }
                }
            };
            timerThread.start();
        }

    }
    public boolean isOnline() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();

    }

}
