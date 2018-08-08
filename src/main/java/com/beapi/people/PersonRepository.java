package com.beapi.people;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {

	public List<Person> findBySsn(String ssn);
	public void deleteBySsn(String ssn);
}
