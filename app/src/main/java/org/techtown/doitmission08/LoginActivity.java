package org.techtown.doitmission08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;

    EditText idInput;
    EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = idInput.getText().toString();
                String password = passwordInput.getText().toString();
                if (id != "" || password != "") {
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);

                    startActivityForResult(intent, REQUEST_CODE_MENU);
                }else {
                    Toast toast = Toast.makeText(getBaseContext(), "아이디와 비밀번호를 입력하세요", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        idInput = findViewById(R.id.loginInput);
        passwordInput = findViewById(R.id.passwordInput);
    }



}