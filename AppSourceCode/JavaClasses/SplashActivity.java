package com.abhiz.wificaptivelogin;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

    public static String str_login_test;

    public static SharedPreferences sh;
    public static SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);

        //initializing the shared preference
        sh = getSharedPreferences("myprefe", 0);
        editor = sh.edit();

        // check here if credentials are saved or not
        str_login_test = sh.getString("loginTest", null);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
            return;
        }

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                /*
                 * if credentials are saved already then redirect to captive login page
                 * else redirect to registration page 
                 */

                if (str_login_test != null && !str_login_test.toString().trim().equals("")) {
                    Intent send = new Intent(getApplicationContext(),LogoutActivity.class);
                    startActivity(send);
                }
                
                else {
                    Intent send = new Intent(getApplicationContext(),Registration.class);
                    startActivity(send);
                }
            }

        }, 2000);

    }

}

