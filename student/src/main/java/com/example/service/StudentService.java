package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.exception.ResourceNotFoundException;
import com.example.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	//save
	
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}
	
	//getAll
	public  List<Student>  getAllStudents(){
		return studentRepo.findAll();
	}
	
	//getById
	public  Student getByStudentId(int id) {
		return studentRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Student","id",id));
		
	}
	
	//update
	public Student updateStudent(Student student,int id) {
		Student existingStudent= studentRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Student","id",id));
		existingStudent.setName(student.getName());
		existingStudent.setAge(student.getAge());
		existingStudent.setAddress(student.getAddress());
		studentRepo.save(existingStudent);
		return existingStudent;
		
	}
	
	//delete
	public void deleteStudent(int id) {
		studentRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Student","id",id));
		studentRepo.deleteById(id);
	}
}
