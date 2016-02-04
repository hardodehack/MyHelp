package com.myhelp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myhelp.model.Ticket;
import com.myhelp.service.TicketService;

@Controller
public class AddTicketController {
	
	private final String TICKET = "ticket";
	private final String SUBMIT = "submit";
	private final String SUBMIT_SUCCESS = "submitSuccess";


	@Autowired
	TicketService ticketService;
	
	/**
	 * This is to deal with adding a ticket
	 * @param ticket
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value=SUBMIT, method=RequestMethod.POST)
	public String submitTicket(@ModelAttribute(value=TICKET)Ticket ticket, BindingResult result, Model model) {
		ticket.getPriority().setTicket(ticket);
		ticket.getStatus().setTicket(ticket);
			
		Long id = ticketService.save(ticket);		
		
		return SUBMIT_SUCCESS;
	}


}
