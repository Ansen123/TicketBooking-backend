package com.nestdigital.ticketbooking.Dao;

import com.nestdigital.ticketbooking.Model.TicketModel;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<TicketModel,Integer> {
}
