package com.myhelp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Priority {
	
	@Id
	@GeneratedValue
	private Long id;
	private String priority;
	
	@MapsId
	@OneToOne(mappedBy="priority")
	private Ticket ticket;
	
	
	//getters and setters;
	
	
	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Long getId() {
		return id;
	}

	public String getPriority() {
		return priority;
	}
	


	public void setId(Long id) {
		this.id = id;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	

}
