package com.bill.provider.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {

	
	public String getTicket() {
		System.out.println("port:8001，provider");
		return "<少林足球>";
	}
}
