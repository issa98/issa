package com.issaasbah.androidassignments;

import android.graphics.Bitmap;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class ListItemsActivity extends AppCompatActivity {

    final String ACTIVITY_NAME = "ListItemsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);


        Log.i(ACTIVITY_NAME, "In onCreate()");

        final ImageButton img = findViewById(R.id.imageButton);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int REQUEST_IMAGE_CAPTURE = 1;

                /*protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                    if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
                        Bundle extras = data.getExtras();
                        Bitmap imageBitmap = (Bitmap) extras.get("data");
                        img.setImageBitmap(imageBitmap);
                    }
                }*/
            }
        });

    }

    public void setOnCheckedChanged() {

        CheckBox box = findViewById(R.id.checkBox6);

        if (box.isChecked()) {
            CharSequence text = "Switch is On";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(this , text, duration);
            toast.show();

        } else {
            CharSequence text = "Switch is Off";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(this , text, duration);
            toast.show();

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
