package com.felipe.costa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.costa.dto.CustomerDto;
import com.felipe.costa.entity.Address;
import com.felipe.costa.entity.Customer;
import com.felipe.costa.repository.AddressRepository;
import com.felipe.costa.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Object saveService(CustomerDto dto) throws Exception {
        try {
            Customer customerResp = customerRepository.save(dto.toEntityCustomer());
            Address address = dto.getAddress();
            address.setCustomer(customerResp);
            Address addressResp = addressRepository.save(address);
            return customerResp;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("error:" + ex.getMessage());
        }

    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
