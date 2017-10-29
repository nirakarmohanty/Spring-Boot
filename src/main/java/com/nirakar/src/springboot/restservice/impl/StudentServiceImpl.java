package com.nirakar.src.springboot.restservice.impl;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Produces;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nirakar.src.springboot.model.Student;
import com.nirakar.src.springboot.restservice.StudentService;

@RestController
@SpringBootApplication
@RequestMapping(value = "/rest/student", method = RequestMethod.GET)
class StudentServiceImpl implements StudentService{

	public Map<Integer, Student> hmStudent = new HashMap<>();

	// http://localhost:8182/rest/student
	
	public HashMap<Integer, Student> getAllStudents() {

		Student one = new Student("Jan", "math");
		hmStudent.put(1, one);
		Student two = new Student("Feb", "history");
		hmStudent.put(2, two);
		Student three = new Student("Mar", "history");
		hmStudent.put(3, three);
		Student four = new Student("Apr", "history");
		hmStudent.put(4, four);
		Student five = new Student("May", "history");
		hmStudent.put(5, five);
		return (HashMap<Integer, Student>) hmStudent;
	}

	
	public Student updateStudent(@RequestBody Student student) throws Exception {

		if (hmStudent.containsKey(new Long(student.getId()))) {
			hmStudent.put(student.getId(), student);
		} else {
			throw new Exception("Student " + student.getId()
					+ " does not exists");
		}

		return student;
	}

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
}