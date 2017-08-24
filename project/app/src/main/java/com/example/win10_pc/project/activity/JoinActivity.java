package com.example.win10_pc.project.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.win10_pc.project.R;

/**
 * Created by win10_pc on 2017-06-12.
 */

public class JoinActivity extends Activity {

    EditText input_email, input_pw, input_school, input_grade, input_nickname;
    TextView memberCheck;
    Button commitcommitButton, cancleButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        bind();

    register_Event();
        register_Event2();
        /*input_email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (!hasFocus) {
                String email = input_email.getText().toString();
                App.getInstance().getHttpService().duplication(email).enqueue(new Callback<Duplication>() {
                    @Override
                    public void onResponse(Call<Duplication> call, Response<Duplication> response) {
                        if (response.isSuccessful()) {
                            Duplication duplication = response.body();
                            if (duplication.isResult()) {
                                memberCheck.setTextColor(Color.GREEN);
                                memberCheck.setText("사용 가능 한 아이디입니다.");
                                isDuplicate = false;
                            } else {
                                memberCheck.setTextColor(Color.RED);
                                memberCheck.setText("이미 등록 된 아이디 입니다.");
                                isDuplicate = true;
                            }
                        } else {
                        }

                    }

                    @Override
                    public void onFailure(Call<Duplication> call, Throwable t) {

                        Toast.makeText(JoinActivity.this, "데이터베이스에 연결 할 수 없습니다.", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        }
    });*/
    }


    private void bind() {

        memberCheck = (TextView) findViewById(R.id.member_check);
        input_email = (EditText) findViewById(R.id.input_email);
        input_pw = (EditText) findViewById(R.id.input_pw);
        input_school = (EditText) findViewById(R.id.input_school);
        input_grade = (EditText) findViewById(R.id.input_grade);
        input_nickname = (EditText) findViewById(R.id.input_nickname);
        commitcommitButton = (Button) findViewById(R.id.commitcommitButton);
        cancleButton = (Button) findViewById(R.id.cancleButton);
    }

    private void register_Event() {

        commitcommitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(TextUtils.isEmpty(input_email.getText().toString()) &&
                        TextUtils.isEmpty(input_pw.getText().toString()))    {
                    Toast.makeText(getApplicationContext(), "학번, 패스워드를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

                    Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                    startActivity(intent);

                }
            }


        });

    }

    private void register_Event2() {

        cancleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);


                startActivity(intent);
            }


        });

    }
}