package br.com.erudio.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Carlos Vinicius");
		person.setLastName("Alves");
		person.setAddress("São Gonçalo - Rio de Janeiro - Brasil");
		person.setGender("Male");
		return person ;
	}
}
