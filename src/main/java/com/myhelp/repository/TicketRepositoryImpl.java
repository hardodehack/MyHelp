package com.myhelp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.myhelp.model.Ticket;

@Repository("ticketRepository")
public class TicketRepositoryImpl implements TicketRepository {

	@PersistenceContext
	EntityManager entityManager;

	public Long save(Ticket ticket) {
		

		
		if (ticket.getId()==null){
			entityManager.persist(ticket);
			entityManager.flush();
		}
		else {
			entityManager.merge(ticket);
		}
		return ticket.getId();
	}

	public List<Ticket> listAll() {
		List<Ticket> listToReturn = entityManager.createNamedQuery(Ticket.LIST_ALL, Ticket.class).getResultList();
		return listToReturn;
	}

	public Ticket findTicket(Long ticketNumber) {
		return entityManager.find(Ticket.class, ticketNumber);
	}

	public Long deleteTicket(Long id) {
		Ticket ticketToRemove = entityManager.find(Ticket.class, id);
		entityManager.remove(ticketToRemove);
		return id;
	}
	
	
	
}
