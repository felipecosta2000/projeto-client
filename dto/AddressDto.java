package com.felipe.costa.dto;

import com.felipe.costa.entity.Address;

public class AddressDto {

    private Long idAddress;
    private String zipcode;
    private String street;
    private String neighborhood;
    private String city;
    private String state;
    private String country;

    public AddressDto() {
        // TODO Auto-generated constructor stub
    }

    public AddressDto(Long idAddress, String zipcode, String street, String neighborhood, String city, String state,
                      String country) {
        super();
        this.idAddress = idAddress;
        this.zipcode = zipcode;
        this.street = street;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address toEntityAddress() {
        Address address = new Address();
        address.setCity(this.city);
        address.setStreet(this.street);
        address.setNeighborhood(this.neighborhood);
        address.setState(this.state);
        address.setCountry(this.country);
        return address;
    }

    @Override
    public String toString() {
        return "AddressDto [idAddress=" + idAddress + ", zipcode=" + zipcode + ", street=" + street + ", neighborhood="
                + neighborhood + ", city=" + city + ", state=" + state + ", country=" + country + "]";
    }

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

