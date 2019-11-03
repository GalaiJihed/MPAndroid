package com.example.myapplog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
private TextView signin;
private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        signin= findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BackToSignIn=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(BackToSignIn);
            }
        });

        back=findViewById(R.id.backToLogin);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignIn=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(SignIn);
            }
        });
    }
}
