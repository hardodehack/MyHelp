package com.myhelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myhelp.model.Ticket;
import com.myhelp.service.TicketService;

@Controller
public class ShowTicketController {
	
	private final String SHOW_ALL_TICKET = "showAllTicket";
	private final String SHOW_ALL = "showAll";
	private final String TICKET_LIST = "ticketList";

	
	@Autowired
	TicketService ticketService;
	/**
	 * This is to show all the entries in the system
	 * @param model
	 * @return
	 */
	@RequestMapping(value=SHOW_ALL_TICKET, method=RequestMethod.GET)
	public String showAllTicket(Model model){
		List<Ticket> ticketList = ticketService.getAll();
		
		model.addAttribute(TICKET_LIST, ticketList);
		return SHOW_ALL;
	}
	


}
