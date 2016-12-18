package com.gdeaditya.eventku;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pref = getSharedPreferences("data", MODE_PRIVATE);
        editor = pref.edit();
        if (pref.getBoolean("keep", false)) {
            Intent i = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        } else {
            //do nothing
        }

        username = (EditText) findViewById(R.id.uname);
        password = (EditText) findViewById(R.id.pass);
    }

    public void login(View view) {
        if (username.getText().toString().equals("gunadarma") && password.getText().toString().equals("gundar1")){
            editor.putBoolean("keep",true);
            Intent i = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        } else {
            Toast.makeText(LoginActivity.this, "LOGIN ANDA GAGAL!", Toast.LENGTH_SHORT).show();
        }

    }
}
