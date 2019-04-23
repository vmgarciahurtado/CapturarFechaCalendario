package com.example.victor.capturarfechacampo;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Calendar calendar = Calendar.getInstance();
    EditText campoCalendario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoCalendario = findViewById(R.id.campoCalendario);
        campoCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentDate = Calendar.getInstance();
                DatePickerDialog mDatePicker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                campoCalendario.setText(""+year+"/"+month+"/"+dayOfMonth);
                            }
                        },mcurrentDate.get(Calendar.YEAR),mcurrentDate.get(Calendar.MONTH),mcurrentDate.get(Calendar.DAY_OF_MONTH));
                mDatePicker.setTitle("SELET DATE");
                mDatePicker.show();
            }
        });
    }
}
