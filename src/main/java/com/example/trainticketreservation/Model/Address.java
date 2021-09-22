package com.example.trainticketreservation.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
public class Address {

    private String city;
    private String province;

    public Address() {
    }

    public Address(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
