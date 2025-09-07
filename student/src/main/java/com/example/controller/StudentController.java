package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public void saveStudent(@RequestBody Student st) {
		studentService.saveStudent(st);		
	}
	
	@GetMapping("/getAllStud")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/getByStudId/{id}")
	public  Student getByStudentId(@PathVariable("id")int id) {
		return studentService.getByStudentId(id);
	}
	
	@PutMapping("/updateStud/{id}")
	public  Student updateStudent(@RequestBody Student student,@PathVariable("id")int id) {
		return studentService.updateStudent(student, id);
	}
	
	
	@DeleteMapping("/deleteStud/{id}")
	public void  deleteStudent(@PathVariable("id")int id) {
		studentService.deleteStudent(id);
	}

}
