package com.example.flightmanagement.dto;

import com.example.flightmanagement.entities.Airport;
import org.springframework.stereotype.Component;

@Component
public class AirportDtoConverter {
    public AirportDTO toDTO(Airport airport) {
        AirportDTO airportDTO = new AirportDTO();
        airportDTO.setAirportId(airport.getAirportId());
        airportDTO.setName(airport.getName());
        airportDTO.setCode(airport.getCode());
        airportDTO.setCity(airport.getCity());
        airportDTO.setCountry(airport.getCountry());
        return airportDTO;
    }

    public Airport toEntity(AirportDTO airportDTO) {
        Airport airport = new Airport();
        airport.setAirportId(airportDTO.getAirportId());
        airport.setName(airportDTO.getName());
        airport.setCode(airportDTO.getCode());
        airport.setCity(airportDTO.getCity());
        airport.setCountry(airportDTO.getCountry());
        return airport;
    }
}
