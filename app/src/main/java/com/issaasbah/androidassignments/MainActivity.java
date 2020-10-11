package com.issaasbah.androidassignments;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.app.Activity.*;

public class MainActivity extends AppCompatActivity {

    final String ACTIVITY_NAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(ACTIVITY_NAME, "In onCreate()");

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListItemsActivity.class);
                startActivityForResult(intent, 10);
            }
        });

    }

    public void onActivityResult(int requestCode, int responseCode, Intent data) {
        if (requestCode == 10) {
            Log.i(ACTIVITY_NAME,"Returned to MainActivity.onActivityResult");
        }

        
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
