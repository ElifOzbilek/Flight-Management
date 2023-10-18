package com.example.flightmanagement.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long airportId;

    @Column()
    private String name;
    @Column()
    private String code;
    @Column()
    private String city;
    @Column()
    private String country;

    public Airport() {
    }
    public Long getAirportId() {
        return airportId;
    }

    public void setAirportId(Long airportId) {
        this.airportId = airportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
