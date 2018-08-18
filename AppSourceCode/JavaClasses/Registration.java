package com.abhiz.wificaptivelogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by abhiz on 17-Aug-18.
 */

public class Registration extends AppCompatActivity  {

    Button register;

    String str_Name,str_Password,
            random;

    EditText edt_Name,edt_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.registration);

        register = (Button) findViewById(R.id.btn_register);
        edt_Name = (EditText) findViewById(R.id.edt_Rname);
        edt_Password = (EditText) findViewById(R.id.edt_Rpassword);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyFunc(view);
            }
        });

    }


    public void MyFunc(View v) {
        str_Name = edt_Name.getText().toString();
        str_Password = edt_Password.getText().toString();

        if (str_Name.length() == 0 & str_Password.length() == 0) {
            Toast.makeText(getApplicationContext(),
                    "All fields are mandatory to fill", Toast.LENGTH_LONG)
                    .show();
        } else if (str_Name.length() == 0) {
            Toast.makeText(getApplicationContext(), "Please enter your Registration number",
                    Toast.LENGTH_LONG).show();
        } else if (str_Password.length() == 0) {
            Toast.makeText(getApplicationContext(),
                    "Please enter your Password", Toast.LENGTH_LONG).show();
        }

        else {
            SplashActivity.editor.putString("name", str_Name);
            SplashActivity.editor.putString("password", str_Password);
            SplashActivity.editor.putString("loginTest", "true");
            SplashActivity.editor.commit();

            Intent sendtoLogin = new Intent(getApplicationContext(),
                    LogoutActivity.class);

            Toast.makeText(getApplicationContext(),
                    "You have successfully registered", Toast.LENGTH_LONG)
                    .show();

            startActivity(sendtoLogin);

        }

    }

    // on back key press exit the app

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(Registration.this, SplashActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }

}
