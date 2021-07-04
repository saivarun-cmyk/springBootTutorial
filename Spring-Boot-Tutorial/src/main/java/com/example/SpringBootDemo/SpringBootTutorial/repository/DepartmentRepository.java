package com.example.SpringBootDemo.SpringBootTutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootDemo.SpringBootTutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	
	public List<Department> findByDepartmentName(String departmentName);
	
	
	public List<Department> findByDepartmentNameIgnoreCase(String departmentName);

}
