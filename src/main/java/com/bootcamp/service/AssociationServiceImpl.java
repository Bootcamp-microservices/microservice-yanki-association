package com.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.Association;
import com.bootcamp.repository.AssociationRepository;

import reactor.core.publisher.Mono;

@Service
public class AssociationServiceImpl implements AssociationService {
	
	private final AssociationEventService associationEventService;

	public AssociationServiceImpl(AssociationEventService associationEventService) {
		super();
		this.associationEventService = associationEventService;
	}
	
	
	@Autowired
	private AssociationRepository associationRepository;

	@Override
	public Mono<Association> saveAssociation(Association association) {
		
		Mono<Association> monoAssociation = associationRepository.save(association);
		System.out.println("microservice yanki: "+association.getIdYanki());
		this.associationEventService.publish(association);
		return monoAssociation;
	}

}
