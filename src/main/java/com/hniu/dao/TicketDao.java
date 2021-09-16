package com.hniu.dao;

import com.hniu.domain.Ticket;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-07-03 15:56
 */
@Repository
public interface TicketDao {
	List<Ticket> findTicketByUIdMIdSId(@Param("uId") Integer uId, @Param("mId") Integer mId, @Param("sId") Integer sId);

	List<Ticket> findTicketByMIdSId(@Param("mId") Integer mId, @Param("sId") Integer sId);

	List<Ticket> findTicketByUId(@Param("uId") Integer uId);

	Integer saveTickets(List<Ticket> tickets);

	void deleteTicket(@Param("tkId") Integer tkId);
}
