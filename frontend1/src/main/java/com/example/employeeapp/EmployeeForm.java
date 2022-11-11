package com.example.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.employeeapp.model.Employee;
import com.example.employeeapp.retrofit.EmployeeApi;
import com.example.employeeapp.retrofit.RetrofitService;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmployeeForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponent();
    }

    private void initializeComponent() {

        TextInputEditText textInputEditName = findViewById(R.id.name_id);
        TextInputEditText textInputEditDepartment = findViewById(R.id.department_id);
        TextInputEditText textInputEditEmail = findViewById(R.id.email_id);
        TextInputEditText textInputEditLocation = findViewById(R.id.location_id);
        //TextInputEditText textInputEditEmployeeCode = findViewById(R.id.employeeCode_id);
        TextInputEditText textInputEditJobTitle = findViewById(R.id.jobTitle_id);
        TextInputEditText textInputEditImageUrl = findViewById(R.id.imageUrl_id);
        MaterialButton buttonSave = findViewById(R.id.save_button);

        RetrofitService retrofitService = new RetrofitService();
        EmployeeApi employeeApi = retrofitService.getRetrofit().create(EmployeeApi.class);

        buttonSave.setOnClickListener(view ->{
            String name = String.valueOf(textInputEditName.getText());
            String email = String.valueOf(textInputEditEmail.getText());
            String location = String.valueOf(textInputEditLocation.getText());
            String department = String.valueOf(textInputEditDepartment.getText());
            String jobTitle = String.valueOf(textInputEditJobTitle.getText());
            String imageUrl = String.valueOf(textInputEditImageUrl.getText());

            Employee employee = new Employee();
            employee.setName(name);
            employee.setEmail(email);
            employee.setLocation(location);
            employee.setDepartment(department);
           // employee.setEmployeeCode(UUID.randomUUID().toString());
            employee.setJobTitle(jobTitle);
            employee.setImageUrl(imageUrl);

            employeeApi.save(employee)
                    .enqueue(new Callback<Employee>() {
                        @Override
                        public void onResponse(Call<Employee> call, Response<Employee> response) {
                            Toast.makeText(EmployeeForm.this, "Save Successful", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(Call<Employee> call, Throwable t) {
                            Toast.makeText(EmployeeForm.this, "Save failed", Toast.LENGTH_SHORT).show();
                            Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, "Error Occurred");
                        }
                    });
                });
    }
}