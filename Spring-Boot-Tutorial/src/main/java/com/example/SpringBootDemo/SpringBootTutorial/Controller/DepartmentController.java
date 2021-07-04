package com.example.SpringBootDemo.SpringBootTutorial.Controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootDemo.SpringBootTutorial.entity.Department;
import com.example.SpringBootDemo.SpringBootTutorial.error.departmentNotFoundException;
import com.example.SpringBootDemo.SpringBootTutorial.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	private final Logger logger = LoggerFactory.getLogger(Department.class);

	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		logger.info("entering into the Save Department Class---->");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/departments")
	public List<Department> getAllDepartments() {

		return departmentService.getAllDepartments();

	}

	@GetMapping("/getById/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws departmentNotFoundException {
		logger.info("entering into the fetchDepartmentById  ---->");

		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		logger.info("entering into the deleteDepartmentById ---->");

		departmentService.deleteDepartmentById(departmentId);			
		return "DepartmentId Successfully Deleted";				
	}
	
	@PutMapping("/updateDepartmentByid/{id}")
	public Department updateDepartmentByid(@PathVariable("id") Long departmentId,@RequestBody Department department) {
		return null;
	}
	
	@GetMapping("/getDepartmentByPropertyName/{name}")
	public List<Department> getDepartmentbyPropertyName(@PathVariable("name") String departmentName) {
		logger.info("entering into the getDepartmentbyPropertyName ---->");

		return departmentService.getDepartmentbyPropertyName(departmentName) ;
	}
	
}
