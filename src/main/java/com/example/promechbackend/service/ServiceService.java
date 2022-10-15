package com.example.promechbackend.service;

import com.example.promechbackend.entity.ServiceEntity;
import com.example.promechbackend.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    public List<ServiceEntity> getAll() {
        return serviceRepository.findAll();
    }
}
