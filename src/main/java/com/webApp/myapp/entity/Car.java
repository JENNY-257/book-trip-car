package com.webApp.myapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Or GenerationType.AUTO
    private Long id;
    private String companyName;
    private String typeOfCar;
    private int year;
    private boolean isAvailable;
    private String destination;
    private int numberOfSeats;

    // Default constructor
    public Car() {}

    // Parameterized constructor
    public Car(String companyName,
               String typeOfCar, 
               int year, 
               boolean isAvailable, 
               String destination,
               int numberOfSeats) {
        this.companyName = companyName;
        this.typeOfCar = typeOfCar;
        this.year = year;
        this.isAvailable = isAvailable;
        this.destination = destination;
        this.numberOfSeats = numberOfSeats;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    // No need for setter for id if it's auto-generated
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
