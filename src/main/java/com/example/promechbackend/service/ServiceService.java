package com.example.promechbackend.service;

import com.example.promechbackend.entity.ServiceEntity;
import com.example.promechbackend.repository.ServiceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @Autowired
    private ModelMapper mapper;

    public List<com.example.promechbackend.dto.Service> getAll() {
        List<ServiceEntity> list = serviceRepository.findAll();
        List<com.example.promechbackend.dto.Service> result = new ArrayList<com.example.promechbackend.dto.Service>();
        for (ServiceEntity s :
                list) {
            result.add(mapper.map(s, com.example.promechbackend.dto.Service.class));
        }
        return result;
    }
}
