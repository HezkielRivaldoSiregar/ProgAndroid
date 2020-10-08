package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private EditText txtUsername;
    private EditText txtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: dipanggil");
        Log.i(TAG, "onCreate: perubahan");

        setContentView(R.layout.activity_main);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txtUsername.getText().toString().equals("admin") && txtPassword.getText().toString().equals("admin")){
                    onClickberhasil();
                }else{
                    Toast.makeText(getApplicationContext(), "Username atau Password Anda tidak benar!", Toast.LENGTH_SHORT).show();
                }
            }
            private void onClickberhasil(){
                setContentView(R.layout.home);
            }

        });
    }
}