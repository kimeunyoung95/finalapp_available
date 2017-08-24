package com.example.win10_pc.project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.estimote.sdk.SystemRequirementsChecker;
import com.example.win10_pc.project.R;

/**
 * Created by win10_pc on 2017-05-28.
 */

public class BeaconActivity extends CustomAppCompatActivity {
   Button newbook_alarm;
    Button cafe_alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beacon_main);


        newbook_alarm = (Button) findViewById(R.id.newbook_alarm);

        cafe_alarm = (Button) findViewById(R.id.cafe_alarm);

        newbook_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NewBookActivity.class);
                startActivity(intent);
            }
        });


        cafe_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CafeActivity.class);
                startActivity(intent);
            }
        });

}

    @Override
    protected void onResume() {
        super.onResume();
        // 블루투스 권한 및 활성화 코드드
        SystemRequirementsChecker.checkWithDefaultDialogs(this);
    }


}
