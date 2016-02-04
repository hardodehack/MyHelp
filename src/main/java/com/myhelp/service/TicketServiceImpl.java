package com.myhelp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myhelp.model.Ticket;
import com.myhelp.repository.TicketRepository;

@Service("ticketService")
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;

	public TicketRepository getTicketRepository() {
		return ticketRepository;
	}

	public void setTicketRepository(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}

	@Transactional
	public Long save(Ticket ticket) {
		Long id = ticketRepository.save(ticket);
		return id;
	}

	public List<Ticket> getAll() {
		return ticketRepository.listAll();
	}

	public Ticket findTicket(Long ticketNumber) {
		
		return ticketRepository.findTicket(ticketNumber);
	}

	@Transactional
	public Long deleteTicket(Long id) {
		return ticketRepository.deleteTicket(id);
	}
	
	


}
