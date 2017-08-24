package com.example.win10_pc.project.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.estimote.sdk.BeaconManager;
import com.estimote.sdk.Region;
import com.estimote.sdk.SystemRequirementsChecker;

import java.util.UUID;

/**
 * Created by COCOMO on 2016-06-24.
 */
public class CustomAppCompatActivity extends AppCompatActivity {

    private BeaconManager beaconManager;
    private Region region;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        beaconManager = new BeaconManager(this);

        region = new Region("ranged region",
                UUID.fromString("24DDF411-8CF1-440C-87CD-E368DAF9C93E"), 501 , 8005);

    }

    @Override
    protected void onResume() {
        super.onResume();

        SystemRequirementsChecker.checkWithDefaultDialogs(this);
    }

    @Override
    protected void onPause() {

        beaconManager.stopRanging(region);

        super.onPause();
    }
}
