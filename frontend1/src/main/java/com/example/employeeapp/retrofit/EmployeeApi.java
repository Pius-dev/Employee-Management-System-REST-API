package com.example.employeeapp.retrofit;

import com.example.employeeapp.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface EmployeeApi {
    @GET("/api/v1/employee/getAll")
    Call <List<Employee>> getAllEmployees();

    @POST("/api/v1/employee/add")
    Call <Employee> save(@Body Employee employee);
}
