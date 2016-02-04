package com.myhelp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	private final String ADD = "add";
	private final String SHOW_ALL = "showAll";
	private final String DELETE = "delete";
	private final String UPDATE = "update";

	/**
	 * Mapping of main page to different pages
	 * @param model
	 * @return
	 */
	@RequestMapping(ADD)
	public String addPage(Model model) {
		return ADD;
	}
	@RequestMapping(SHOW_ALL)
	public String showAllPage(Model model) {
		return SHOW_ALL;
	}
	@RequestMapping(DELETE)
	public String deletePage(Model model) {
		return DELETE;
	}
	@RequestMapping(UPDATE)
	public String updatePage(Model model) {
		return UPDATE;
	}
	

}
