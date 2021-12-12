package com.simplilearn.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.simplilearn.event.NewsEvent;

@Component
public class EventPublisher implements ApplicationEventPublisherAware{
	@Autowired
	ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}
	
	public void publish() {
		NewsEvent ne = new NewsEvent(this);
		this.publisher.publishEvent(ne);
	}
}
