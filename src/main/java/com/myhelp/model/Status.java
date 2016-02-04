package com.myhelp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Status {
	
	@Id
	@GeneratedValue
	private Long id;
	private String status;

	@MapsId
	@OneToOne(mappedBy="status")
	private Ticket ticket;
	
	
	//getters and setters
	
	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Long getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
