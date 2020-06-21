package com.bill.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bill.provider.service.TicketService;

@RestController
public class TicketController {

	
	@Autowired
	TicketService ticketService;
	
	@GetMapping("/ticket")
	public String getTicket() {
		return ticketService.getTicket();
	}
}
