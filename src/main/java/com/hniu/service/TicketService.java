package com.hniu.service;

import com.hniu.domain.Ticket;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-07-03 16:00
 */
public interface TicketService {
	List<Ticket> findTicketByUIdMIdSId(Integer uId, Integer mId, Integer sId);

	List<Ticket> findTicketByMIdSId(Integer mId, Integer sId);

	List<Ticket> findTicketByUId(Integer uId);

	Integer saveTickets(List<Ticket> tickets);

	void deleteTicket(Integer tkId);

}
