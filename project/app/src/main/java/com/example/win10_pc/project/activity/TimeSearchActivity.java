package com.example.win10_pc.project.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.win10_pc.project.R;

/**
 * Created by win10_pc on 2017-05-28.
 */

public class TimeSearchActivity extends Activity {
    Button back_button;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timesearch);

       back_button = (Button) findViewById(R.id.back_button);
       back_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), MainActivity.class);
               startActivity(intent);
           }
       });
}
}
