package com.myhelp.repository;

import java.util.List;

import com.myhelp.model.Ticket;

public interface TicketRepository {

	/**
	 * This is to save a ticket or to update a ticket to the system
	 * @param ticket
	 * @return
	 */
	Long save(Ticket ticket);

	/**
	 * This is to get a list of all tickets in the system
	 * @return
	 */
	List<Ticket> listAll();

	/**
	 * This is to find a ticket using its ticket id in the system
	 * @param ticketNumber
	 * @return
	 */
	Ticket findTicket(Long ticketNumber);

	/**
	 * This is to delete a ticket using its ticket id
	 * @param id
	 * @return
	 */
	Long deleteTicket(Long id);

}
