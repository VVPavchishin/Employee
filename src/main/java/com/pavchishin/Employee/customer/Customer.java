package com.pavchishin.Employee.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int bankCount;
    private String car;
    private String country;

    public Customer() {}

    public Customer(String firstName, String lastName, int bankCount, String car, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankCount = bankCount;
        this.car = car;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBankCount() {
        return bankCount;
    }

    public void setBankCount(int bankCount) {
        this.bankCount = bankCount;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}