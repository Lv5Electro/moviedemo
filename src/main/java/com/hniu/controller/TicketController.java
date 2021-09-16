package com.hniu.controller;

import com.alibaba.fastjson.JSONObject;
import com.hniu.domain.Ticket;
import com.hniu.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-06-24 20:58
 */
@RestController
@RequestMapping("/ticket")
@CrossOrigin
public class TicketController {

	private final TicketService ticketService;

	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	@GetMapping(value = "/findTicketByUId", produces = "application/json; charset=utf-8")
	public String findTicketByUId(Integer uId) {
		List<Ticket> tickets = ticketService.findTicketByUId(uId);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("tickets", tickets);
		String rs = jsonObject.toJSONString();
		return rs;
	}

	@GetMapping(value = "/findTicketByUIdMIdSId", produces = "application/json; charset=utf-8")
	public String findTicketByUIdMIdSId(Integer uId, Integer mId, Integer sId) {
		List<Ticket> tickets = ticketService.findTicketByUIdMIdSId(uId, mId, sId);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("tickets", tickets);
		String rs = jsonObject.toJSONString();
		return rs;
	}

	@GetMapping(value = "/findTicketByMIdSId", produces = "application/json; charset=utf-8")
	public String findTicketByMIdSId(Integer mId, Integer sId) {
		List<Ticket> tickets = ticketService.findTicketByMIdSId(mId, sId);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("tickets", tickets);
		String rs = jsonObject.toJSONString();
		return rs;
	}

	@PostMapping(value = "/saveTickets", produces = "application/json; charset=utf-8")
	public List<Ticket> saveTickets(@RequestBody List<Ticket> tickets) {
		System.out.println(tickets);
		Integer tkId = ticketService.saveTickets(tickets);
		return tickets;
	}

	@GetMapping(value = "/deleteTicket", produces = "application/json; charset=utf-8")
	public void deleteTicket(Integer tkId) {
		ticketService.deleteTicket(tkId);
	}
}
