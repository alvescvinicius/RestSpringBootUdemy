package br.com.erudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.data.vo.PersonVO;
import br.com.erudio.data.vo.v2.PersonVOV2;
import br.com.erudio.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService services;

	@GetMapping
	public List<PersonVO> findAll() {
		return services.findAll();
	}

	@GetMapping("/{id}")
	public PersonVO findById(@PathVariable("id") Long id) {
		return services.findById(id);
	}
	
	@PostMapping
	public PersonVO create(@RequestBody PersonVO person) {
		return services.create(person);
	}
	
	/*
	 * Cria rota /person/v2 para nova versão do metódo create, 
	 * mantendo a versão inicial em funcionamento.
	 */
	@PostMapping("/v2")
	public PersonVOV2 createV2(@RequestBody PersonVOV2 person) {
		return services.createV2(person);
	}
	
	@PutMapping
	public PersonVO update(@RequestBody PersonVO person) {
		return services.update(person);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		services.delete(id);
		return ResponseEntity.ok().build();
	}
	
}