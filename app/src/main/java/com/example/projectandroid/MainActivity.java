package com.example.projectandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Serializable {

    private Button addButton;
    ListView listView;
    static ArrayList<Employee> arraylist = new ArrayList<>();
    Adapter_CustomList adapter_customList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arraylist = new ArrayList<>();
        adapter_customList = new Adapter_CustomList(this,arraylist);



        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter_customList);

        addButton =  findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForm();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,EmployeeDetailsActivity.class);

                Employee e  = arraylist.get(position);

                StringBuilder stringBuilder = new StringBuilder();
                intent.putExtra("name","Name: "+ e.getFirstName() +" "+e.getLastName()+", a"+ e.getType() +"\n");
                intent.putExtra("age","Age: "+(e.getAge())+"\n");
                intent.putExtra("vehicle","Employee has: " +e.getVehicle().getCategory()+"\n");
                intent.putExtra("detail", "Model: "+e.getVehicle().getModel()+"\n"
                +"-Plate: "+e.getVehicle().getPlate() +"\n"
                +"- Color: "+e.getVehicle().getColor() +"\n");

                if (e.getVehicle().getCategory().equals("Car")){

                    intent.putExtra("type"," - Type"+((Car) e.getVehicle()).getCategory()+"\n");

                }
                else
                {
                    intent.putExtra("type"," - Type: " + e.getVehicle().getCategory() + "\n");
                    if(((Motorcycle)e.getVehicle()).isSidecar())
                        intent.putExtra("type"," - Type: With SideCar\n");
                    else
                        intent.putExtra("type"," - Type: Without SideCar\n");
                }

                intent.putExtra("rate", "Occupation Rate: "+e.getOccupationRate()+"\n");
                intent.putExtra("income","Annual Income: " +(e.getMonthlySalary())+"\n");
                intent.putExtra("progress","He/She has completed: "+e.getNumberOfProjects());

                startActivity(intent);





            }
        });




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode , resultCode ,data);
        adapter_customList.notifyDataSetChanged();
    }

    public void openForm(){
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }
}
