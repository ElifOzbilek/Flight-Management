package com.example.flightmanagement.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flightId;

    @Column()
    private String flightNumber;

    @Column()
    private double price;

    @Column()
    private Date departureTime;

    @Column()
    private Date arrivalTime;

    @Column()
    private int capacity;

    @Column()
    private String status;

    @Column()
    private Long routeId;

    @Column()
    private String departureCity;

    @Column()
    private String arrivalCity;

    public Flight(){

    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }
    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public  Integer getCapacity(){
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDepartureCity(){
        return departureCity;
    }
    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
}

