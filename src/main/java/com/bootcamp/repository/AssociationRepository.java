package com.bootcamp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.entity.Association;

@Repository
public interface AssociationRepository extends ReactiveMongoRepository<Association, ObjectId> {

}
