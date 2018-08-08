package com.beapi.people;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private APIService apiService;
	
	
	/*GET - All*/
	@RequestMapping("/people")
	public List<Person> getAllPeople(){
		return apiService.getAllPeople();
	}
	
	/*GET - One*/
	@RequestMapping("/people/{id}")
	public Person getPerson(@PathVariable("id") String id) {
		return apiService.getPerson(id);
	}
	
	/*GET - By SSN*/
	@RequestMapping("/people/{ssn}")
	public List<Person> findBySSN(@PathVariable("ssn") String ssn){
		return apiService.findBySSN(ssn);
	}
	
	/*POST*/
	@RequestMapping(method=RequestMethod.POST, value="/people")
	public void addPerson(@RequestBody Person person) {
		apiService.addPerson(person);
	}
	
	/*PUT - Lastname*/
	@RequestMapping(method=RequestMethod.PUT, value="/people/{id}")
	public void updateLastname(@RequestBody @PathVariable("id") String id, String lastname) {
		apiService.updateLastname(id,lastname);
	}
	
	
	/*DELETE - One By SSN*/
	@RequestMapping(method=RequestMethod.DELETE, value="/people/{ssn}")
	public void deleteBySSN(@PathVariable("ssn") String ssn) {
		apiService.deleteBySSN(ssn);
	}
	
	
	

}
