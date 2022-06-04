package com.longbridge.domain;

public class Address {
    /*
     * Creating An Address Entity,
     * Sending it to the Person entity We created
     * Constructor, Getter&Setter Methods
     * */
    private String street;
    private String zipcode;

    public Address() {

    }

    public Address(String street, String zipcode) {
        this.street = street;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
