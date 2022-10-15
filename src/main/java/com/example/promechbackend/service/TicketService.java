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
        String service = ticket.getService();
//        for (String s :
//                ticket.getService()) {
//            service+=s.substring(2, s.length()-2) + ", ";
//        }
//        service = service.substring(0, service.length()-2);
        return ticketRepository.createTicket(ticket.getPhone(), ticket.getName(), ticket.getPassword(), ticket.getDescription(), service);
    }

    public Integer updateTicket(Ticket ticket) {
        String service = ticket.getService();
//        for (String s :
//                ticket.getService()) {
//            service+=s.substring(2, s.length()-2) + ", ";
//        }
//        service = service.substring(0, service.length()-2);
        return ticketRepository.updateTicket(ticket.getTicketID(), ticket.getPhone(), ticket.getName(), ticket.getPassword(), ticket.getDescription(), service);
    }

    public Integer confirmTicket(Ticket ticket) {
        return ticketRepository.confirmTicket(ticket.getTicketID());
    }
}
