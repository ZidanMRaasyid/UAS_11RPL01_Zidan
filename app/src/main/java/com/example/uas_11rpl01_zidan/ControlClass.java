package com.example.uas_11rpl01_zidan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ControlClass extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
        if (sharedPreferences.getString("username", "").isEmpty() ||
                sharedPreferences.getString("username", "").equalsIgnoreCase("")){
            //login dulu
            startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            finish();
        }else{
            startActivity(new Intent(getApplicationContext(),MainMenu.class));
            finish();
        }
    }
}