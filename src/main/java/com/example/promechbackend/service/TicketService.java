package com.example.promechbackend.service;

import com.example.promechbackend.dto.Ticket;
import com.example.promechbackend.entity.TicketEntity;
import com.example.promechbackend.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    public TicketEntity getTicketByPhone(int phone) {
        return ticketRepository.getByPhone(phone);
    }

    public List<TicketEntity> getAll() {
        return ticketRepository.getAll();
    }

    public Integer createTicket(Ticket ticket) {
        return ticketRepository.createTicket(ticket.getPhone(), ticket.getName(), ticket.getPassword(), ticket.getDescription(), ticket.getService());
    }

    public Integer updateTicket(Ticket ticket) {
        return ticketRepository.updateTicket(ticket.getTicketID(), ticket.getPhone(), ticket.getName(), ticket.getPassword(), ticket.getDescription(), ticket.getService());
    }

    public Integer confirmTicket(Ticket ticket) {
        return ticketRepository.confirmTicket(ticket.getTicketID());
    }
}
