package com.eSchool.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eSchool.vo.StudentVO;

@Path("/eSchool")
public class ESchoolService {
	
	@POST
	@Path("/saveStudent")
	public void saveStudent(StudentVO studentVO){
		
	}

	@GET
	@Path("/getStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public String getStudents(){
		
		return "Satish,Kumar";
	}
}
