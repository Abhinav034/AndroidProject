package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EmployeeDetailsActivity extends AppCompatActivity {
        String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);

        Intent intent = getIntent();


        s += intent.getStringExtra("name");
        s += intent.getStringExtra("age");
        s += intent.getStringExtra("vehicle");
        s += intent.getStringExtra("detail");
        s += intent.getStringExtra("type");
        s += intent.getStringExtra("rate");
        s += intent.getStringExtra("income");
        s += intent.getStringExtra("progress");


        TextView textView = findViewById(R.id.textView9);
        textView.setText(s);

    }
}
