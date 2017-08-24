package com.example.win10_pc.project.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.win10_pc.project.R;
import com.example.win10_pc.project.activity.BeaconActivity;
import com.example.win10_pc.project.activity.BookActivity;
import com.example.win10_pc.project.activity.CaldroidSampleActivity;
import com.example.win10_pc.project.activity.FloorSearchActivity;
import com.example.win10_pc.project.activity.InformationActivity;
import com.example.win10_pc.project.activity.MapActivity;
import com.example.win10_pc.project.activity.MobileActivity;
import com.example.win10_pc.project.activity.SelectSubjectActivity;
import com.example.win10_pc.project.activity.TimeSearchActivity;

public class HomeFragment extends Fragment {

    Button information;
    ImageView time_search;
    ImageView floor_search;
    ImageView book;
    ImageView book_calendar;
    ImageView book_search;
    ImageView path_search;
    ImageView mobile;
    ImageView beacon_alarm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        information = (Button) view.findViewById(R.id.information);
        time_search = (ImageView) view.findViewById(R.id.time_search);
        floor_search = (ImageView) view.findViewById(R.id.floor_search);
        book = (ImageView) view.findViewById(R.id.book);
        book_calendar = (ImageView) view.findViewById(R.id.book_calendar);
        book_search = (ImageView)view.findViewById(R.id.book_search);
        path_search = (ImageView) view.findViewById(R.id.path_search);
        mobile = (ImageView) view.findViewById(R.id.mobile2);
        beacon_alarm = (ImageView) view.findViewById(R.id.beacon_alarm);;

        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), InformationActivity.class);
                startActivity(intent);
            }
        });


        time_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), TimeSearchActivity.class);
                startActivity(intent);
            }
        });


        floor_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), FloorSearchActivity.class);
                startActivity(intent);
            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), BookActivity.class);
                startActivity(intent);
            }
        });

        book_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), CaldroidSampleActivity.class);
                startActivity(intent);
            }
        });

        book_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), SelectSubjectActivity.class);
                startActivity(intent);
            }
        });

        path_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });

        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), MobileActivity.class);
                startActivity(intent);
            }
        });

        beacon_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), BeaconActivity.class);
                startActivity(intent);
            }
        });

        return view;


    }


    }

