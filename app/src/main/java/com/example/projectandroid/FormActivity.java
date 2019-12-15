package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class FormActivity extends AppCompatActivity {

    RadioGroup vehiclesRadio;
    LinearLayout linearLayout;

    Button button;

    Spinner emtype;
    EditText firstname , lastname ,birthyear , salary , occupationRate , employeeId , projects, model ,plateNumber;

    ArrayList<Employee> dataModel = new ArrayList<>();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
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
        emtype =  (Spinner) findViewById(R.id.emtype);
        button = findViewById(R.id.button);
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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedItem = emtype.getSelectedItem().toString();
                String fname = firstname.getText().toString();
                String lname = lastname.getText().toString();
                String birthYear = birthyear.getText().toString();
                String empSalary = salary.getText().toString();
                String oRate = occupationRate.getText().toString();
                String eId = employeeId.getText().toString();
                String project = projects.getText().toString();
                String vModel = model.getText().toString();
                String pNumber = plateNumber.getText().toString();

                if (selectedItem.contains("Manager")){

                    System.out.println("################");

                }
                else if (selectedItem.contains("Tester")){

                    System.out.println("%%%%%%%%%%%%%%%%%%");

                }
                else if (selectedItem.contains("Programmer")){

                    System.out.println("$$$$$$$$$$$$$$$$$$");
                }



            }
        });



    }



}
