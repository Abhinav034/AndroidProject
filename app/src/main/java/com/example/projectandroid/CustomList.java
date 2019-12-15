package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CustomList extends AppCompatActivity {

    TextView textname , textid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        textname = findViewById(R.id.textView4);
        textid = findViewById(R.id.textView5);



    }



}
