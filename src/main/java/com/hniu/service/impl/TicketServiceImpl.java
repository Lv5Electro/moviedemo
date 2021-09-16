package com.hniu.service.impl;

import com.hniu.dao.TicketDao;
import com.hniu.domain.Ticket;
import com.hniu.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-07-03 16:01
 */
@Service("TicketService")
public class TicketServiceImpl implements TicketService {

	private final TicketDao ticketDao;

	public TicketServiceImpl(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

	@Override
	public List<Ticket> findTicketByUIdMIdSId(Integer uId, Integer mId, Integer sId) {
		return ticketDao.findTicketByUIdMIdSId(uId, mId, sId);
	}

	@Override
	public List<Ticket> findTicketByMIdSId(Integer mId, Integer sId) {
		return ticketDao.findTicketByMIdSId(mId, sId);
	}

	@Override
	public List<Ticket> findTicketByUId(Integer uId) {
		return ticketDao.findTicketByUId(uId);
	}

	@Override
	public Integer saveTickets(List<Ticket> tickets) {
		return ticketDao.saveTickets(tickets);
	}

	@Override
	public void deleteTicket(Integer tkId) {
		ticketDao.deleteTicket(tkId);
	}
}
