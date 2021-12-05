package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText editTextTextPersonName3;
     EditText editTextTextPassword;
     Button buttonLogin;
     Button buttonRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextTextPersonName3.getText().toString().equals("admin")
                && editTextTextPassword.getText().toString().equals("admin") ) {
                    //实现跳转
                    Toast.makeText(MainActivity.this, "输入正确", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent();
                    intent.setClass(MainActivity.this,MyActivity.class);
                    MainActivity.this.startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "输入错误", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}