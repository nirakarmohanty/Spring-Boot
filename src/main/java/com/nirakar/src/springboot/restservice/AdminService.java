package com.nirakar.src.springboot.restservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nirakar.src.springboot.model.Student;

/**
 * This interface describes Admin related behaviors such as File upload , editing the form ..
 * @author NIRAKAR
 *
 */
@RequestMapping(value = "/rest/student", method = RequestMethod.GET)
public interface AdminService {
	@POST
    @Path("/upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
	public Student updateStudent(@PathVariable int id,
			@PathVariable String name, @PathVariable String subject)
			throws Exception;


}
