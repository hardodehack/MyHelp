package com.myhelp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myhelp.model.Ticket;
import com.myhelp.service.TicketService;

@Controller
public class UpdateTicketController {
	
	private final String FIND_BY_ID = "findById";
	private final String UPDATE = "update";
	private final String MODIFY = "modify";
	private final String MODIFY_SUCCESS = "modifySuccess";
	private final String TICKET = "ticket";
	private final String TICKET_NUMBER = "ticketNumber";
	

	@Autowired
	TicketService ticketService;


	/**
	 * This is to modify the record
	 * @param ticket
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value=MODIFY, method=RequestMethod.POST)
	public String modifyRecord(@ModelAttribute(TICKET)Ticket ticket, BindingResult result, Model model){
		// due to priority is separate table, refer them in one another
		ticket.getPriority().setTicket(ticket);
		ticket.getStatus().setTicket(ticket);
		//update, set priority and status ids manually
		ticket.getPriority().setId(ticket.getId());
		ticket.getStatus().setId(ticket.getId());
		Long id = ticketService.save(ticket);	
		return MODIFY_SUCCESS;
	}
	
	/**
	 * This is to find a record on the update page
	 * @param ticketNumber
	 * @param model
	 * @return
	 */
	@RequestMapping(value=FIND_BY_ID)
	public String findRecord(@RequestParam(TICKET_NUMBER)Long ticketNumber, Model model){
		
		Ticket ticket = ticketService.findTicket(ticketNumber);
		model.addAttribute(TICKET,ticket);
		return UPDATE;
	}
	
}
