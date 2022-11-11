package com.example.employeeapp.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.employeeapp.R;

public class EmployeeHolder extends RecyclerView.ViewHolder {

    TextView name, jobTitle, department,imageUrl,location,email;
    public EmployeeHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.List_item_name);
        location = itemView.findViewById(R.id.List_item_location);
        department = itemView.findViewById(R.id.List_item_department);
        jobTitle = itemView.findViewById(R.id.List_item_jobTitle);
        email = itemView.findViewById(R.id.List_item_email);
        imageUrl = itemView.findViewById(R.id.List_item_imageUrl);
    }
}
