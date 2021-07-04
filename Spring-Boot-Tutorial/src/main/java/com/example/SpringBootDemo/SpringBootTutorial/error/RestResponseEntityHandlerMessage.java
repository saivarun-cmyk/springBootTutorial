package com.example.SpringBootDemo.SpringBootTutorial.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.SpringBootDemo.SpringBootTutorial.entity.ErrorMessage;


@ControllerAdvice
@ResponseStatus
public class RestResponseEntityHandlerMessage extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(departmentNotFoundException.class)
	public ResponseEntity<ErrorMessage> DepartmentIdNotFoundexception(departmentNotFoundException exception, WebRequest webrequest) {
		
		
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}

}
