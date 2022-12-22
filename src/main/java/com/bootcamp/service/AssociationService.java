package com.bootcamp.service;

import com.bootcamp.entity.Association;

import reactor.core.publisher.Mono;

public interface AssociationService {
	
     public Mono<Association> saveAssociation(Association association);

}
