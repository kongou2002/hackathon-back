package com.example.promechbackend.service;

import com.example.promechbackend.dto.Account;
import com.example.promechbackend.entity.TechnicalStaffEntity;
import com.example.promechbackend.repository.TechnicalStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicalStaffService {
    @Autowired
    TechnicalStaffRepository technicalStaffRepository;

    public TechnicalStaffEntity login(Account acc) {
        return technicalStaffRepository.login(acc.getPhone(), acc.getPassword());
    }
}
