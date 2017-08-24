package com.example.win10_pc.project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.win10_pc.project.R;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 27.
 * Time  : 오후 9:33
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :dd
 */
public class FullMap2Activity extends AppCompatActivity {

    Button book_location_search;
    Button book_location_a;
    Button book_location_b;
    Button book_location_c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullmap_main);

        book_location_search = (Button) findViewById(R.id.book_location_search);
        book_location_a = (Button) findViewById(R.id.book_location_a);
        book_location_b = (Button) findViewById(R.id.book_location_b);
        book_location_c = (Button) findViewById(R.id.book_location_c);

        book_location_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CzoneActivity.class);
                startActivity(intent);
            }
        });

        book_location_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AzoneActivity.class);
                startActivity(intent);
            }
        });

        book_location_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BzoneActivity.class);
                startActivity(intent);
            }
        });

        book_location_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CzoneActivity.class);
                startActivity(intent);
            }
        });

    }


}