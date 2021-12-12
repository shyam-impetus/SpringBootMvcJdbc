package com.simplilearn.listeners;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.event.NewsEvent;

@Component
public class AppEventHandler {
	@EventListener
	public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
		System.out.println(" ===== Context has started =====");
	}
	
	@EventListener
	public void onApplicationStoppedEvent(ContextStoppedEvent contextStoppedEvent) {
		System.out.println(" ===== Context has stopped =====");
	}
	
	@EventListener
	public void newsEventListener1(NewsEvent ne) {
		System.out.println(" ===== News event Listener =====");
	}
}
