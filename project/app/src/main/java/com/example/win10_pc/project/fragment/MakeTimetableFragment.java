package com.example.win10_pc.project.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.win10_pc.project.R;
import com.example.win10_pc.project.activity.BookActivity;


public class MakeTimetableFragment extends Fragment {
    ImageView ivTitle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_book2_main, container, false);

        ivTitle = (ImageView) view.findViewById(R.id.ivTitle);


        ivTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), BookActivity.class);
                startActivity(intent);
            }
        });


        return view;

    }
    }