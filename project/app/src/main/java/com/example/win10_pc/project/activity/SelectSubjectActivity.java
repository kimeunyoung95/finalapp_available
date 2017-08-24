package com.example.win10_pc.project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.win10_pc.project.R;

import java.util.ArrayList;

/**
 * Created by win10_pc on 2016-07-07.
 */
public class SelectSubjectActivity  extends AppCompatActivity {
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"} ;

    Button addButton;
    Button deleteButton;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            String msg = data.getStringExtra("subject")+","+data.getIntExtra("subject_id",0);

            Toast.makeText(getApplication(), msg, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.tableview_select1) ;

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU) ;

        ListView listview = (ListView) findViewById(R.id.listview1) ;
        listview.setAdapter(adapter) ;


        // 빈 데이터 리스트 생성.
        final ArrayList<String> items = new ArrayList<String>() ;
        // ArrayAdapter 생성. 아이템 View를 선택(single choice)가능하도록 만듦.
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, items);

        // listview 생성 및 adapter 지정.
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter) ;

        listview.setOnItemClickListener(onItemClickListener);



        Button backbutton = (Button) findViewById(R.id.backbutton);



        // add button에 대한 이벤트 처리.
        addButton = (Button) findViewById(R.id.add);
        final ArrayAdapter finalAdapter = adapter;
        addButton.setOnClickListener(new Button.OnClickListener() {
                                         public void onClick (View v){
                                             int count = 1;
                                             count = finalAdapter.getCount();

                                            if(count == 1) {
                                                items.add("모바일 프로그래밍, 나구역");
                                            }
                                             if(count == 2) {
                                                 items.add("어린왕자, 가구역");
                                             }
                                             if(count == 3) {
                                                 items.add("나니아 연대기, 다구역");
                                             }


                                             // 아이템 추가.
                                             items.add("책 이름명" + Integer.toString(count + 1));

                                             // listview 갱신
                                             finalAdapter.notifyDataSetChanged();
                                         }
                                     }

        );

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        // delete button에 대한 이벤트 처리.
        deleteButton = (Button) findViewById(R.id.delete);
        final ArrayAdapter finalAdapter2 = adapter;
        final ListView finalListview = listview;
        deleteButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int count, checked ;
                count = finalAdapter2.getCount() ;

                if (count > 0) {
                    // 현재 선택된 아이템의 position 획득.
                    checked = finalListview.getCheckedItemPosition();

                    if (checked > -1) {
                        // 아이템 삭제
                        items.remove(checked) ;

                        // listview 갱신.
                        finalAdapter2.notifyDataSetChanged();
                    }
                }
            }
        }) ;
    }

    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View v, int position, long id)
        {
            if(position > 0){
                Intent intent = new Intent(getApplicationContext(), SelectDetailActivity.class);
                startActivityForResult(intent, 1);
            }

        }


    };

}