package com.example.androidhomeworklessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_three);

        Button buttonFive = findViewById(R.id.btn_transition_five);

        buttonFive.setOnClickListener(v -> {
            Intent e = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(e);
        });

        Button buttonSix = findViewById(R.id.btn_transition_six);

        buttonSix.setOnClickListener(v -> {
            Intent f = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(f);
        });

    }
}