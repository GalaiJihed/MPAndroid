package com.example.myapplog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
private Button btnlogin;
private TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnlogin = findViewById(R.id.Login);
        register=findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Register=new Intent(WelcomeActivity.this,RegisterActivity.class);
                startActivity(Register);
            }
        });
    btnlogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i =new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(i);

        }
    });
    }
}
