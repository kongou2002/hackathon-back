package com.example.promechbackend.controller;

import com.example.promechbackend.entity.ServiceEntity;
import com.example.promechbackend.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Service")
public class ServiceController {
    @Autowired
    ServiceService serviceService;
    @GetMapping("/ALL")
    List<ServiceEntity> getAll(){
        return serviceService.getAll();
    }
}
