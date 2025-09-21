package com.fabricio.crud.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabricio.crud.person.model.Person;

@Repository  //Vou utilizar os recursos do JPA 
public interface PersonRepository extends JpaRepository<Person, Long> {

}
