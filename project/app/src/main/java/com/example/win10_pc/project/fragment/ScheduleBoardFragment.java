package com.example.win10_pc.project.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.win10_pc.project.R;
import com.example.win10_pc.project.activity.SelectSubjectActivity;


/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 7. 7.
 * Time  : 오후 11:06
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */

public class ScheduleBoardFragment extends Fragment {


    Button tv_main_nextbutton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_board, container, false);


        tv_main_nextbutton = (Button) view.findViewById(R.id.tv_main_nextbutton);

        tv_main_nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), SelectSubjectActivity.class);
                startActivity(intent);
            }
        });

        return view;


    }

    }