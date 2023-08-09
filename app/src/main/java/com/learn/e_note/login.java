package com.learn.e_note;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private TextView tv_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loggin_page);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        tv_login=findViewById(R.id.tv_login);
        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail=email.getText().toString();
                String pass=password.getText().toString();
                if(mail.isEmpty() || pass.isEmpty())
                    Toast.makeText(login.this, "Please fill all the details", Toast.LENGTH_SHORT).show();
            }
        });


    }
}