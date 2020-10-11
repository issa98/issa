package com.issaasbah.androidassignments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    final String ACTIVITY_NAME = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.i(ACTIVITY_NAME, "In onCreate()");

        Button loginBtn = findViewById(R.id.loginBtn);

        final TextView logintxt = findViewById(R.id.logintxt);

        final SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = logintxt.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("emailKey", email);

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }

    public void onResume() {

        super.onResume();

        Log.i(ACTIVITY_NAME, "In onResume()");

    }

    public void onStart() {

        super.onStart();

        Log.i(ACTIVITY_NAME, "In onStart()");
    }

    public void onPause() {

        super.onPause();

        Log.i(ACTIVITY_NAME, "In onPause()");
    }

    public void onStop() {

        super.onStop();

        Log.i(ACTIVITY_NAME, "In onStop()");
    }

    public void onDestroy() {

        super.onDestroy();

        Log.i(ACTIVITY_NAME, "In onDestroy()");
    }

}
