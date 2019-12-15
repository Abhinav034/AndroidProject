package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityForm extends AppCompatActivity {

    RadioGroup vehiclesRadio;
    LinearLayout linearLayout;

    Spinner emtype;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        vehiclesRadio = (RadioGroup) findViewById(R.id.vehiclesRadio);

        linearLayout = (LinearLayout) findViewById(R.id.SideCar);

        

        emtype = (Spinner) findViewById(R.id.emtype);

        linearLayout.setVisibility(linearLayout.INVISIBLE);

        vehiclesRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.motorbike)
                {
                    linearLayout.setVisibility(linearLayout.VISIBLE);
                }
                else if (checkedId == R.id.car)
                {
                    linearLayout.setVisibility(linearLayout.INVISIBLE);
                }
            }
        });
    }
}
