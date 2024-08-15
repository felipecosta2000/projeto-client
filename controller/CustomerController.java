package com.felipe.costa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.costa.dto.CustomerDto;
import com.felipe.costa.service.CustomerService;

@RequestMapping("/api/customer")
@ResponseBody
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody CustomerDto dto ){
        try {
            return ResponseEntity.status(200).body(customerService.saveService(dto));
        }catch(Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(500).body(ex.getMessage());
        }
    }

    @GetMapping("/findall")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.status(200).body(customerService.findAll());
    }
}
