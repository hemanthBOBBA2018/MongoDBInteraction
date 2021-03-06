package com.hemanth.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//AOP where after every controller call
@ControllerAdvice
public class TeacherExceptionController {

	@ExceptionHandler(value = TeacherNotFoundException.class)
	public ResponseEntity<Object> exception(TeacherNotFoundException exception){
	return new ResponseEntity<>("Teacher not found", HttpStatus.NOT_FOUND);
}
}