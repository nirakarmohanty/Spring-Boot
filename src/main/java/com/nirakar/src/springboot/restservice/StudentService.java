package com.nirakar.src.springboot.restservice;

import java.util.HashMap;

import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nirakar.src.springboot.model.Student;

public interface StudentService {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	@Produces("application/json")
	public HashMap<Integer, Student> getAllStudents();

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ResponseBody
	@Produces("application/json")
	public Student updateStudent(@RequestBody Student student) throws Exception;

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@Produces("application/json")
	@ResponseBody
	public Student deleteStudent(@PathVariable int id) throws Exception;
}
