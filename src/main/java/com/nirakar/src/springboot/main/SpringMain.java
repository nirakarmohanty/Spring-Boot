package com.nirakar.src.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
@ImportResource("classpath:Spring-application-context.xml")
public class SpringMain {
	public static void main(String[] args) {
		SpringApplication.run(SpringMain.class, args);
	}

	@RequestMapping("/hello")
	String hello() {
		return "[Spring Main ]Hello Boot!!!!";
	}
	/*@RequestMapping(value="/rest/student",method = RequestMethod.GET)
	@ResponseBody
	public HashMap<Long, Student> getAllStudents() {
		Map<Long, Student> hmStudent = new HashMap<>();
		Student one = new Student("John", "math");
		hmStudent.put(new Long(one.getId()), one);
		Student two = new Student("Janie", "history");
		hmStudent.put(new Long(two.getId()), two);
		return (HashMap<Long, Student>) hmStudent;
	}*/

}
