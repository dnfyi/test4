package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText editTextTextPersonName3;
    EditText editTextTextPassword;
    Button buttonLogin;
    Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextTextPersonName3.getText().toString().equals("admin")
                        && editTextTextPassword.getText().toString().equals("admin")) {
                    //实现跳转
                    Intent intent = new Intent(LoginActivity.this, SuccessActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle("错误");
                    dialog.setMessage("用户名或者密码错误");
                    dialog.setCancelable(false);
                    dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.show();
                }
            }
        });
    }
}






