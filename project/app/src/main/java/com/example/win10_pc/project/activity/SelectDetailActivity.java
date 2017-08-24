package com.example.win10_pc.project.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.win10_pc.project.R;

/**
 * Created by win10_pc on 2016-07-07.
 */
public class  SelectDetailActivity extends Activity implements AdapterView.OnItemClickListener {
    //서버랑 값 연결
    String subject;
    int subject_id;
    Button backbackbutton;
    Button storebutton;
    Button mapbutton1;
    Button mapbutton2;
    Button mapbutton3;

    String[] arrlist = new String[]
            {
                    "어린왕자",
                    "해리포터",
                    "모바일 프로그래밍",
                    "위대한 개츠비",
                    "자바 프로그래밍",
                    "나니아 연대기",
                     "언어의 온도",
                    "말의 품격",
                    "한국사 대비 요점집",
                    "정보처리기사 필기서"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tableview_select2);
        // 데이터를 저장하고 세팅하는 곳, 스트링형식의 배열어뎁터 만들기
        ArrayAdapter<String> Adapter;

        // android.R.layout.simple_list_item_1형식으로 arrlist 넘겨줌줌
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrlist);

        //리스트 뷰 형식의 list에 ListView 뿌려주기
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(Adapter);

        backbackbutton = (Button) findViewById(R.id.backbackbutton);
        storebutton = (Button) findViewById(R.id.storebutton);
        mapbutton2 = (Button) findViewById(R.id.mapbutton2);
        mapbutton1 = (Button) findViewById(R.id.mapbutton1);
        mapbutton3 = (Button) findViewById(R.id.mapbutton3);

        storebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "onClick: ");
                Intent intent = getIntent();
                intent.putExtra("subject", subject);
                intent.putExtra("subject_id", subject_id);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        list.setOnItemClickListener(this);

        backbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectSubjectActivity.class);
                startActivity(intent);
            }
        });


        mapbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FullMap1Activity.class);
                startActivity(intent);
            }
        });
            mapbutton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), FullMapActivity.class);
                    startActivity(intent);
                }
            });



        mapbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FullMap2Activity.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
        TextView a =(TextView) findViewById(R.id.storetext);
        TextView tv = (TextView) view;
        subject = tv.getText().toString();
        subject_id = i;
        if(i % 3 == 1)
        {
            a.setText("책 이름 :" + tv.getText() + "\n (선택된 구역 : 다 구역)");

        }
        if(i % 3 == 2)
        {
            a.setText("책 이름 :" + tv.getText() + "\n (선택된 구역 : 나 구역)");

        }
        if(i % 3 == 0)
        {
            a.setText("책 이름 :" + tv.getText() + "\n (선택된 구역 : 가 구역)");

        }

    }
}
