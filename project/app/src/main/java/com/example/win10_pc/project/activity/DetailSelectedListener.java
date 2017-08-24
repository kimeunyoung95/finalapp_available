package com.example.win10_pc.project.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by win10_pc on 2016-07-07.
 */
public class DetailSelectedListener implements AdapterView.OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        Toast.makeText(parent.getContext(),
                "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
