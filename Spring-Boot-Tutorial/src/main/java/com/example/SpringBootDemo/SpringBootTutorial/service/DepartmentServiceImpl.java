package com.example.SpringBootDemo.SpringBootTutorial.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootDemo.SpringBootTutorial.entity.Department;
import com.example.SpringBootDemo.SpringBootTutorial.error.departmentNotFoundException;
import com.example.SpringBootDemo.SpringBootTutorial.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	 
	
 @Autowired
 private DepartmentRepository departmentRepository;

	private final Logger logger = LoggerFactory.getLogger(Department.class);

	@Override
	public Department saveDepartment(Department department) {
		logger.info("entering into the Save DepartmentService Class---->");
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) throws departmentNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<Department> findById = departmentRepository.findById(departmentId);
		if(!findById.isPresent()) {
			throw new departmentNotFoundException("department Id is Not Available");
		}
		return findById.get();
	}

	@Override
	public String deleteDepartmentById(Long departmentId) {		 
		departmentRepository.deleteById(departmentId);
				return "deleted";
	}

	@Override
	public List<Department> getDepartmentbyPropertyName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
	}

}
