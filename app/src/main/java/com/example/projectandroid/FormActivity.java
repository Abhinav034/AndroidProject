package com.example.projectandroid;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.time.Year;
import java.util.ArrayList;

public class FormActivity extends AppCompatActivity implements Serializable {

   private RadioGroup sideCarRadio;
    LinearLayout projectType;
    TextView typeToBeChange;
    RadioButton radioButton;
    RadioGroup vehiclesRadio;
    private Employee employee;
    LinearLayout linearLayout1, linearLayout2;
    String vehicleType;
    Button button;
    Spinner emtype , cartype ,color ;
    private RadioGroup yesBtn;
    private String selectedEmployeeType;
    EditText firstname , lastname ,birthyear , salary , occupationRate , employeeId , projects, model ,plateNumber;

    ArrayList<Employee> employeeList;

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
        projectType = findViewById(R.id.project_type);
        projects = findViewById(R.id.nprojects);
        projectType.setVisibility(View.GONE);
        typeToBeChange = findViewById(R.id.type_to_be_change);
         model = findViewById(R.id.vmodel);
         plateNumber = findViewById(R.id.pnumber);
        vehiclesRadio = findViewById(R.id.vehiclesRadio);
        linearLayout1 = findViewById(R.id.SideCar);
        cartype = findViewById(R.id.carType);
        linearLayout2 = findViewById(R.id.layout_car);
        emtype =  findViewById(R.id.emtype);
        color = findViewById(R.id.vcolor);
        sideCarRadio = findViewById(R.id.sidecarRadio);
        button = findViewById(R.id.button);

        vehiclesRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.motorbike)
                {   vehicleType = "Bike";
                    linearLayout1.setVisibility(View.VISIBLE);
                    linearLayout2.setVisibility(View.GONE);
                }
                else if (checkedId == R.id.car)
                {   vehicleType = "Car";
                   linearLayout1.setVisibility(View.GONE);
                   linearLayout2.setVisibility(View.VISIBLE);
                }
            }
        });

            emtype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    selectedEmployeeType = emtype.getSelectedItem().toString();
                    projectType.setVisibility(View.VISIBLE);

                    if(selectedEmployeeType.equals("Manager")){

                        typeToBeChange.setText("#Projects");

                    }
                    else if(selectedEmployeeType.equals("Tester")){

                        typeToBeChange.setText("#Bugs");

                    }
                    else if(selectedEmployeeType.equals("Programmer")){

                        typeToBeChange.setText("#Codes");

                    }
                    else{
                        projectType.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {

                employee = new Employee();

                employee.setFirstName(firstname.getText().toString());
                employee.setLastName(lastname.getText().toString());
                employee.setBirthYear(birthyear.getText().toString());
                employee.setMonthlySalary(salary.getText().toString());
                employee.setOccupationRate(occupationRate.getText().toString());
                employee.setEmployeeId(employeeId.getText().toString());
                employee.setNumberOfProjects(projects.getText().toString());
                employee.setType(selectedEmployeeType);
                if (vehicleType.equals("Bike")){
                    Motorcycle mc = new Motorcycle();
                    mc.setModel(model.getText().toString());
                    mc.setCategory("Motorcycle");
                    mc.setPlate(plateNumber.getText().toString());
                    int selectedId = sideCarRadio.getCheckedRadioButtonId();

                    radioButton = findViewById(selectedId);
                    if (radioButton.getText().equals("Yes")) {
                        mc.setSidecar(true);
                    } else {
                        mc.setSidecar(false);
                    }
                    mc.setColor(color.getSelectedItem().toString());
                    employee.setVehicle(mc);

                }
                else if (vehicleType.equals("Car")) {

                    Car car = new Car();
                    car.setType(cartype.getSelectedItem().toString());
                    car.setModel(model.getText().toString());
                    car.setPlate(plateNumber.getText().toString());
                    car.setColor(color.getSelectedItem().toString());
                    car.setCategory("Car");
                    employee.setVehicle(car);

                }
                MainActivity.arraylist.add(employee);
                sendData(employee);

            }
        });

    }

    private void sendData(Employee employee) {
        setResult(Activity.RESULT_OK);
        finish();


    }

    private void startActivityAndPassBundle (Activity activity, Class c, Bundle bundle){

        Intent intent = new Intent(activity, c);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }





}
