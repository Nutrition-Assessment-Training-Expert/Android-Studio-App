package com.araboy.natefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView txtForgotPassword, txtRegister;
    EditText edtUserName, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtForgotPassword = findViewById(R.id.txtforgot);
        txtRegister = findViewById(R.id.txtRegister);
        edtPassword = findViewById(R.id.edtPassword);
        edtUserName = findViewById(R.id.edtUsername);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), com.araboy.natefinal.RegisterActivity.class));
            }
        });

    }


}