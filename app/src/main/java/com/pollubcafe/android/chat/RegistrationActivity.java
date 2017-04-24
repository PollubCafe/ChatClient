package com.pollubcafe.android.chat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    EditText mName;
    EditText mEmail;
    EditText mPassword;
    EditText mRePassword;
    Button mBtnSignUp;
    TextView mLoginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        setupViews();
    }

    private void setupViews() {
        mName = (EditText) findViewById(R.id.signup_input_name);
        mEmail = (EditText) findViewById(R.id.signup_input_email);
        mPassword = (EditText) findViewById(R.id.signup_input_password);
        mRePassword = (EditText) findViewById(R.id.signup_input_reEnterPassword);
        mBtnSignUp = (Button) findViewById(R.id.btn_signup);
        mLoginLink = (TextView) findViewById(R.id.link_login);

        mBtnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();

            }
        });

        mLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void signUp() {

    }

    private boolean validateFields() {
        return false;
    }
}
