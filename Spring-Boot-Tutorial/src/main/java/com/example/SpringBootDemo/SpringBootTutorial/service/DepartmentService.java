package com.example.SpringBootDemo.SpringBootTutorial.service;

import java.util.List;

import com.example.SpringBootDemo.SpringBootTutorial.entity.Department;
import com.example.SpringBootDemo.SpringBootTutorial.error.departmentNotFoundException;

public interface DepartmentService {

public Department saveDepartment(Department department);

public List<Department> getAllDepartments();

public Department fetchDepartmentById(Long departmentId) throws departmentNotFoundException;

public String deleteDepartmentById(Long departmentId);

public List<Department> getDepartmentbyPropertyName(String departmentName);

}
