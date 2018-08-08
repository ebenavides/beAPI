package com.beapi.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private APIService apiService;
	
	
	/*GET - All*/
	@RequestMapping("/people")
	public void getAllPeople(){
		/* return apiService.getAllPeople();*/
	}
	
	/*GET - One*/
	@RequestMapping("/people/{id}")
	public void getPerson() {
		/*return apiService.getPerson(@PathVariable("id") String id);*/
	}
	
	/*PUT - Lastname*/
	@RequestMapping(method=RequestMethod.PUT, value="/people/{id}")
	public void updateLastname() {
		/* apiService.updateLastname();*/
	}
	

	/*DELETE - One By SSN*/
	@RequestMapping(method=RequestMethod.DELETE, value="/people/{ssn}")
	public void deleteBySSN() {
		/* apiService.deleteBySSN();*/
	}
	
	
	

}
