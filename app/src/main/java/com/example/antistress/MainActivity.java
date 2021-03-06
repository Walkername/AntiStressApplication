package com.example.antistress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBreathActivity(View v) {
        Intent intent = new Intent(this, BreathActivity.class);
        startActivity(intent);
    }

    public void openSoundsActivity(View v) {
        Intent intent = new Intent(this, SoundsActivity.class);
        startActivity(intent);
    }

    public void openTextsActivity(View v) {
        Intent intent = new Intent(this, TextsActivity.class);
        startActivity(intent);
    }

}