package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class FormActivity extends AppCompatActivity {

    RadioGroup vehiclesRadio;
    LinearLayout linearLayout;

    Spinner emtype;
    EditText firstname , lastname ,birthyear , salary , occupationRate , employeeId , projects, model ,plateNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        firstname = findViewById(R.id.fname);
        lastname = findViewById(R.id.lname);
        birthyear = findViewById(R.id.byear);
        salary = findViewById(R.id.salary);
        occupationRate = findViewById(R.id.orate);
        employeeId = findViewById(R.id.eid);
        projects = findViewById(R.id.nprojects);
         model = findViewById(R.id.vmodel);
         plateNumber = findViewById(R.id.pnumber);
        vehiclesRadio = (RadioGroup) findViewById(R.id.vehiclesRadio);
        linearLayout = (LinearLayout) findViewById(R.id.SideCar);
        emtype = (Spinner) findViewById(R.id.emtype);
        linearLayout.setVisibility(linearLayout.INVISIBLE);

       String selectedItem = emtype.getSelectedItem().toString();


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
