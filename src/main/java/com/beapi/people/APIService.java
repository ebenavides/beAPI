package com.beapi.people;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class APIService {
	
	@Autowired
	private PersonRepository peopleRepository;
	
	
	
	
	/*Hardcoded data (mockup)*/
	/*public void fillDB() {
		ArrayList<String> names=new ArrayList<>(Arrays.asList("Abel", "Saul", "Maria"));
		ArrayList<String> lastnames= new ArrayList<>(Arrays.asList("Buenavista", "Cordoba", "Jimenez"));
		ArrayList<String> birthdays= new ArrayList<>(Arrays.asList("11/08/80", "11/09/85", "02/12/90"));
		ArrayList<String> ssns = new ArrayList<>(Arrays.asList("1234", "5678", "9101"));
		for(int i=0; i<names.size();i++) {
			this.addPerson(new Person(Integer.toString(i),names.get(i),lastnames.get(i),ssns.get(i),birthdays.get(i)));
		}
	}*/
	
	
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
	
	/*Find by SSN*/
	public List<Person> findBySSN(String ssn) {
		return peopleRepository.findBySsn(ssn);		
	}
	
	/*Create Person*/
	public void addPerson(Person person) {
		peopleRepository.save(person);
	}
	
	/*Update by Lastname*/
	public void updateLastname(String id, String lastname) {
		Person person = this.getPerson(id);
		if(person.getLastname()!="") {
			person.setLastname(lastname);
			peopleRepository.save(person);
		}
		
	}
	
	/*Delete by SSN*/
	public void deleteBySSN(String ssn) {
		peopleRepository.deleteBySsn(ssn);
	}
	


}
