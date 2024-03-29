package com.example.projectandroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_CustomList extends BaseAdapter {

    ArrayList<Employee> arrayList;
    Context context;
    public Adapter_CustomList(Context context, ArrayList<Employee> e)
    {
        arrayList = e;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.activity_custom_list, parent, false);
        }

        Employee currentItem = (Employee) getItem(position);
        TextView textViewName = (TextView)
                convertView.findViewById(R.id.textView4);
        TextView textViewID = (TextView)
                convertView.findViewById(R.id.textView5);
        textViewName.setText(currentItem.getFirstName());
        textViewID.setText(currentItem.getEmployeeId());
        return convertView;
    }
}
