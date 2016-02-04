package com.myhelp.service;

import java.util.List;

import com.myhelp.model.Ticket;

public interface TicketService {
	
	/**
	 * This is to save a ticket or to update an existing ticket
	 * @param ticket
	 * @return
	 */
	Long save(Ticket ticket);
	/**
	 * get all tickets from the system
	 * @return
	 */
	List<Ticket> getAll();
	/**
	 * find a ticket using its id
	 * @param ticketNumber
	 * @return
	 */
	Ticket findTicket(Long ticketNumber);

	/**
	 * delete a ticket with its id
	 * @param id
	 * @return
	 */
	Long deleteTicket(Long id);

}