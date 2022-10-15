package com.example.promechbackend.controller;

import com.example.promechbackend.dto.Account;
import com.example.promechbackend.entity.TechnicalStaffEntity;
import com.example.promechbackend.service.TechnicalStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("TechnicalStaff")
public class TechnicalStaffController {
    @Autowired
    TechnicalStaffService technicalStaffService;
    @PostMapping("/Login")
    public TechnicalStaffEntity login(@ModelAttribute Account acc){
        TechnicalStaffEntity result = technicalStaffService.login(acc);
        return result;
    }
}