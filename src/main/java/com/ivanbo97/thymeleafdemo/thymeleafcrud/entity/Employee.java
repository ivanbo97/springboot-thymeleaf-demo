package com.ivanbo97.thymeleafdemo.thymeleafcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import static com.ivanbo97.thymeleafdemo.thymeleafcrud.util.ApplicationConstants.ENTITY_EMPLOYEE_TABLE_NAME;
import static com.ivanbo97.thymeleafdemo.thymeleafcrud.util.ApplicationConstants.ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_ID;
import static com.ivanbo97.thymeleafdemo.thymeleafcrud.util.ApplicationConstants.ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_FIRST_NAME;
import static com.ivanbo97.thymeleafdemo.thymeleafcrud.util.ApplicationConstants.ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_LAST_NAME;
import static com.ivanbo97.thymeleafdemo.thymeleafcrud.util.ApplicationConstants.ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_EMAIL;
@Entity
@Table(name = ENTITY_EMPLOYEE_TABLE_NAME)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_ID)
	private int id;
	
	@Column(name = ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_FIRST_NAME )
	private String firstName;
	
	@Column(name = ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_LAST_NAME)
	private String lastName;
	
	@Column(name = ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_EMAIL)
	private String email;
	
	public Employee () {
		
	}

	public Employee(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
	
}
