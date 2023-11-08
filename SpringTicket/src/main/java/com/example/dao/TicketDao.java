package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
