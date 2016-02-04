package com.myhelp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myhelp.model.Ticket;
import com.myhelp.service.TicketService;

@Controller
public class DeleteTicketController {
	
	private final String FIND_BY_ID_TO_DELETE = "findByIdToDelete";
	private final String TICKET_NUMBER = "ticketNumber";
	private final String DELETE = "delete";
	private final String TICKET = "ticket";
	private final String DELETE_TICKET = "deleteTicket";
	private final String ID = "id";
	private final String DELETE_SUCCESS = "deleteSuccess";





	@Autowired
	TicketService ticketService;
	
	/**
	 * This is to deal with finding the record on the delete page
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value=FIND_BY_ID_TO_DELETE)
	public String findByIdToDelete(@RequestParam(TICKET_NUMBER) Long id, Model model) {
		Ticket ticket = ticketService.findTicket(id);
		model.addAttribute(TICKET, ticket);
		return DELETE;
		
	}
	/**
	 * This is to delete a record
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value=DELETE_TICKET)
	public String deleteById(@RequestParam(ID) Long id, Model model){
		Long deletedId = ticketService.deleteTicket(id);
		model.addAttribute(ID, deletedId);
		return DELETE_SUCCESS;
		
	}

}
