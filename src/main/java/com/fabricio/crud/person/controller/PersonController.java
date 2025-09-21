package com.fabricio.crud.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fabricio.crud.person.model.Person;
import com.fabricio.crud.person.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Person create(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@GetMapping
	public List<Person> getAllPerson(){
		return personRepository.findAll();
	}
	@DeleteMapping("{id}")//passar o id do person que vou deletar
	public void deletar(@PathVariable Long id) {
		Person p1=new Person();
		p1.setId(id);
		personRepository.delete(p1);
	}
	
}
