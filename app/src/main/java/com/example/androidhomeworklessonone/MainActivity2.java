package com.example.androidhomeworklessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    EditText selectDate;
    private int mYear, mMonth, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_two);

        selectDate = (EditText) findViewById(R.id.date);


        selectDate.setOnClickListener(this);


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


    @Override
    public void onClick(View view) {

        if (view == selectDate) {
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            selectDate.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }

    }
}