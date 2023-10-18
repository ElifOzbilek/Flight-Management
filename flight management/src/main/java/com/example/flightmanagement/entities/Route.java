package com.example.flightmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long routeId;
    private Long originAirportId;
    private Long destinationAirportId;

    public Route (){

    }
    public Route (Long originAirportId, Long destinationAirportId){
        this.originAirportId = originAirportId;
        this.destinationAirportId = destinationAirportId;
    }
    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public Long getOriginAirportId() {
        return originAirportId;
    }

    public void setOriginAirportId(Long originAirportId) {
        this.originAirportId = originAirportId;
    }

    public Long getDestinationAirportId() {
        return destinationAirportId;
    }

    public void setDestinationAirportId(Long destinationAirportId) {
        this.destinationAirportId = destinationAirportId;
    }

}
