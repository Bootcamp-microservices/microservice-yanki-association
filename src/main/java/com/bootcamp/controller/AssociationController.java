package com.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.entity.Association;
import com.bootcamp.service.AssociationService;

import reactor.core.publisher.Mono;

@RestController
public class AssociationController {

	
	@Autowired
	private AssociationService associationService;
	
	@GetMapping(value = "/associationDebitCard")
	public Mono<Association> associationDebitCard(@RequestBody Association association) {
		return associationService.saveAssociation(association);
	}
	
}
