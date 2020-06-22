package com.bill.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/buy")
	public String buyTicket(String name) {
		return name+"買了"+"";
	}
}
