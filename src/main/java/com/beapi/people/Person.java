package com.beapi.people;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private int id;
	private String name;
	private String lastname;
	private int ssn;
	private String birthday;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String lastname, int ssn, String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.ssn = ssn;
		this.birthday = birthday;
	}
	
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the ssn
	 */
	public int getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
