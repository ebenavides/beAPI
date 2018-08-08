package com.beapi.people;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class APIService {
	
	@Autowired
	private PersonRepository peopleRepository;
	
	
	/*Get Person by ID*/
	public Person getPerson(String id) {
		Optional<Person> person = peopleRepository.findById(id);
		if (person.isPresent()){return person.get();}
		else{return new Person();}
	}
	
	/*Get Collection*/
	public List<Person> getAllPeople() {
		List<Person> people = new ArrayList<>();
		peopleRepository.findAll()
		.forEach(people::add);
		return people;
	}
	
	public void orderByLastname() {}
	
	public void findByLastname() {}
	
	public void findBySSN() {}
	
	public void updateLastname() {}
	
	public void deleteBySSN() {}
	


}
