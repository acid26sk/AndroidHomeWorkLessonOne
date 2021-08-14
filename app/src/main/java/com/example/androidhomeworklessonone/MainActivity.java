package com.example.androidhomeworklessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_one);


        Button enteredButton = findViewById(R.id.btn_entered);

        enteredButton.setOnClickListener(v -> {

            EditText taskOne = findViewById(R.id.text_input);
            String str = taskOne.getText().toString();
            TextView newText = findViewById(R.id.text_entered);
            newText.setText("Доброго дня и всего самого наилучшего " + str + "!!!");
        });

        Button buttonOne = findViewById(R.id.btn_transition_one);

        buttonOne.setOnClickListener(v -> {
            Intent a = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(a);
        });

        Button buttonTwo = findViewById(R.id.btn_transition_two);

        buttonTwo.setOnClickListener(v -> {
            Intent b = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(b);
        });


    }


}