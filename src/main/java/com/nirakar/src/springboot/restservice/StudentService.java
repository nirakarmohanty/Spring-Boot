package com.nirakar.src.springboot.restservice;

import java.util.HashMap;

import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nirakar.src.springboot.model.Student;

@RequestMapping(value = "/rest/student", method = RequestMethod.GET)
public interface StudentService {
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	@ResponseBody
	@Produces("application/json")
	public HashMap<Integer, Student> getAllStudentDetails();

	@RequestMapping(value = "/update/{id}/{name}/{subject}", method = RequestMethod.PUT)
	@ResponseBody
	@Produces("application/json")
	public Student updateStudent(@PathVariable int id,
			@PathVariable String name, @PathVariable String subject)
			throws Exception;

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@Produces("application/json")
	@ResponseBody
	public Student deleteStudent(@PathVariable int id) throws Exception;
}
