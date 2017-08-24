package com.example.win10_pc.project.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.win10_pc.project.R;

/**
 * Created by win10_pc on 2017-05-27.
 */

public class LoginActivity extends Activity {
    String username;
    EditText usernameinput, passwordinput;
    Button loginButton, registerButton;
    ImageView loginImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bind();

        String username = usernameinput.getText().toString();

    }


    private void bind() {

        usernameinput = (EditText) findViewById(R.id.usernameinput);
        passwordinput = (EditText) findViewById(R.id.passwordinput);
        loginButton = (Button) findViewById(R.id.loginButton);
        registerButton = (Button) findViewById(R.id.registerButton);
        loginImage = (ImageView) findViewById(R.id.loginImage);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(TextUtils.isEmpty(usernameinput.getText().toString()) &&
                    TextUtils.isEmpty(passwordinput.getText().toString()))    {
                Toast.makeText(getApplicationContext(), "학번, 패스워드를 입력해주세요", Toast.LENGTH_SHORT).show();
            }
            else{

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                Toast.makeText(getApplicationContext(), "로그인 하였습니다.", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
            }});


              /*  if (usernameinput.getText().toString().equals("2014111598")) {

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }});

                else if(TextUtils.isEmpty(usernameinput.getText().toString()) &&
                        TextUtils.isEmpty(passwordinput.getText().toString()))
                    {
                    Toast.makeText(getApplicationContext(), "학번, 패스워드를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "학번, 비밀번호가 틀렸습니다", Toast.LENGTH_SHORT).show();
                }
            }

        }  );*/

     /*   loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if (!TextUtils.isEmpty(usernameinput.getText().toString()) &&
//                        !TextUtils.isEmpty(passwordinput.getText().toString())) {
//
//                    App.getInstance().getHttpService().signIn(
//                            new SignRequest(usernameinput.getText().toString(),
//                                    passwordinput.getText().toString())
//                    ).enqueue(new Callback<SignResponse>() {
//                        @Override
//                        public void onResponse(Call<SignResponse> call, Response<SignResponse> response) {
//
//                            if (response.body() != null && !TextUtils.isEmpty(response.body().toString())) {
//                                String token = response.body().getToken();
//                                finish();
//
//                            }
//                            else {
//                                Toast.makeText(getApplicationContext(), "로그인에 실패했습니다", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//
//                        @Override
//                        public void onFailure(Call<SignResponse> call, Throwable t) {
//
//                            Log.e(Constants.TAG_LOG, t.getMessage(), t);
//                            Toast.makeText(getApplicationContext(), "로그인에 실패했습니다", Toast.LENGTH_SHORT).show();
//
//                        }
//                    });
//
//                } else {
//                    Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show();
//                }
//
            }
        });*/




        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }
        });



    }
}
