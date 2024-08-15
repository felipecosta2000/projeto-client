package com.felipe.costa.dto;

import java.time.LocalDateTime;

import com.felipe.costa.entity.Address;
import com.felipe.costa.entity.Customer;

public class CustomerDto {

    private Long idCustomer;
    private String name;
    private String email;
    private String cellphone;
    private LocalDateTime dateCreated;

    private Address  address;

    public CustomerDto() {
        // TODO Auto-generated constructor stub
    }

    public CustomerDto(Long idCustomer, String name, String email, String cellphone, LocalDateTime dateCreated,
                       Address address) {
        super();
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.cellphone = cellphone;
        this.dateCreated = dateCreated;
        this.address = address;
    }

    /// Gabaritou
    @Override
    public String toString() {
        return "CustomerDto [idCustomer=" + idCustomer + ", name=" + name + ", email=" + email + ", cellphone="
                + cellphone + ", dateCreated=" + dateCreated + ", address =" + address  + "]";
    }

    public Customer toEntityCustomer() {
        Customer customer = new Customer();
        customer.setEmail(this.email);
        customer.setName(this.name);
        customer.setCellphone(this.cellphone);
        customer.setDateCreated(LocalDateTime.now());
        return customer;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



}

