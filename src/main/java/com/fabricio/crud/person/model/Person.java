package com.fabricio.crud.person.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data; 

@Data
@Entity // Essa classe vai virar uma tabela
//@Table (name = "Pessoa") // O nome da tabela pra essa classe
public class Person {

	@Id //Essa propriedade é chave primária
	@GeneratedValue (strategy = GenerationType.AUTO) // Como minha chave primaria será criada 
	private Long id;  
	@Column // Qual o nome da coluna name no BD
	private String name;
	
}
