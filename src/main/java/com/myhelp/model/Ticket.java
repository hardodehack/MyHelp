package com.myhelp.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity
@NamedQueries({
	@NamedQuery(name=Ticket.LIST_ALL, query="SELECT t FROM Ticket t")
})
public class Ticket {
	
	public static final String LIST_ALL = "listAll";
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	private Date date;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Priority priority;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Status status;
	
	@Column(columnDefinition = "TEXT")
	private String comments;
	
	
	//getters and setters
	public String getComments() {
		return comments;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getDescription() {
		return description;
	}
	public String getFirstName() {
		return firstName;
	}

	public Long getId() {
		return id;
	}
	public String getLastName() {
		return lastName;
	}
	public Priority getPriority() {
		return priority;
	}
	public Status getStatus() {
		return status;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	

}
