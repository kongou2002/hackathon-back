package com.example.promechbackend.dto;


import lombok.*;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket {
    private int ticketID;
    private int phone;
    private String name;
    private String password;
    private String description;
    private List<String> service;
}
