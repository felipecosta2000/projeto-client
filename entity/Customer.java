package com.felipe.costa.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;
    private String name;
    private String email;
    private String cellphone;
    private LocalDateTime dateCreated;

    @OneToOne(mappedBy = "customer", cascade = { CascadeType.ALL })
    private Address address;

    public Customer() {
        this.dateCreated = LocalDateTime.now();
    }

    public Customer(Long idCustomer, String name, String email, String cellphone) {
        super();
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.cellphone = cellphone;
        this.dateCreated = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Customer [idCustomer=" + idCustomer + ", name=" + name + ", email=" + email + ", cellphone=" + cellphone
                + ", dateCreated=" + dateCreated + "]";
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
