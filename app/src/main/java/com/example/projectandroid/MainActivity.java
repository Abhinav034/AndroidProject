package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("First One");
        arrayList.add("Second One");
        arrayList.add("Third One");
        arrayList.add("Forth One");
        arrayList.add("Fifth One");
        arrayList.add("Sixth One");
        arrayList.add("Seventh One");
        arrayList.add("Eighth One");
        arrayList.add("Ninth One");
        arrayList.add("Tenth One");
        arrayList.add("Seventh One");
        arrayList.add("Eighth One");
        arrayList.add("Ninth One");
        arrayList.add("Tenth One");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForm();
            }
        });
    }

    public void openForm(){
        Intent intent = new Intent(this, ActivityForm.class);
        startActivity(intent);
    }
}
