package com.example.projectandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        adapter_customList = new Adapter_CustomList(getApplicationContext(),arraylist);



        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter_customList);

        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForm();
            }
        });





    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        adapter_customList.notifyDataSetChanged();
    }

    public void openForm(){
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }
}
