package com.example.androidhomeworklessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_two);

        Button buttonThree = findViewById(R.id.btn_transition_three);

        buttonThree.setOnClickListener(v -> {
            Intent c = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(c);
        });

        Button buttonFour = findViewById(R.id.btn_transition_four);

        buttonFour.setOnClickListener(v -> {
            Intent d = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(d);
        });

    }
}