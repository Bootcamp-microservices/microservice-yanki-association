package com.bootcamp.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.bootcamp.entity.Association;
import com.bootcamp.event.AssociationCreatedEvent;
import com.bootcamp.event.Event;
import com.bootcamp.event.EventType;

@Component
public class AssociationEventService {

	@Autowired
	private KafkaTemplate<String,Event<?>> producer;
	
	public void publish(Association association) {
		AssociationCreatedEvent created = new AssociationCreatedEvent();
		created.setData(association);
		created.setId(UUID.randomUUID().toString());
		created.setType(EventType.CREATED);
		created.setDate(new Date());
		this.producer.send("topic-yanki-1",created);
	}
	
}
