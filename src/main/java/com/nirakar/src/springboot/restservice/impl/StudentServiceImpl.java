package com.nirakar.src.springboot.restservice.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nirakar.src.springboot.model.Student;
import com.nirakar.src.springboot.restservice.StudentService;

@RestController
@SpringBootApplication
@RequestMapping(value = "/rest/student", method = RequestMethod.GET)
class StudentServiceImpl implements StudentService{

	public static Map<Integer, Student> hmStudent = new HashMap<>();
	StudentServiceImpl(){
		this.prepareStudentDetails();
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public HashMap<Integer, Student> getAllStudentDetails() {
		return (HashMap<Integer, Student>) hmStudent;
	}


	@RequestMapping(path = "/update/{id}/{name}/{subject}", method = RequestMethod.PUT)
	public Student updateStudent(@PathVariable int id,
			@PathVariable String name, @PathVariable String subject) throws Exception {

		if (hmStudent.containsKey(id)) {
			Student studentObject = new Student();
			studentObject.setId(id);
			studentObject.setName(name);
			studentObject.setSubject(subject);
			hmStudent.put(id, studentObject);
		} else {
			throw new Exception("Student " + id
					+ " does not exists");
		}

		return hmStudent.get(id);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	
	public Student deleteStudent(@PathVariable int id) throws Exception {

		Student student;

		if (hmStudent.containsKey(id)) {
			student = hmStudent.get(id);
			hmStudent.remove(id);
		} else {
			throw new Exception("Student " + id + " does not exists");
		}
		return student;
	}
	
	private void prepareStudentDetails() {
		
		for(int i=0;i<1000;i++){
			Student s1 = new Student();
			s1.setName("Name"+i);
			s1.setId(i);
			s1.setSubject("Subject"+i);
			hmStudent.put(i, s1);
		}
		
		
	}

}