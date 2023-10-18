package com.example.flightmanagement.dto;

import com.example.flightmanagement.entities.Flight;
import org.springframework.stereotype.Component;

@Component
public class FlightDtoConverter {
    public FlightDTO toDTO(Flight flight) {
        FlightDTO flightDTO = new FlightDTO();
        flightDTO.setFlightId(flight.getFlightId());
        flightDTO.setFlightNumber(flight.getFlightNumber());
        flightDTO.setRouteId(flight.getRouteId());
        flightDTO.setDepartureTime(flight.getDepartureTime());
        flightDTO.setArrivalTime(flight.getArrivalTime());
        flightDTO.setStatus(flight.getStatus());
        flightDTO.setCapacity(flight.getCapacity());
        flightDTO.setDepartureCity(flight.getDepartureCity());
        flightDTO.setArrivalCity(flight.getArrivalCity());
        flightDTO.setPrice(flight.getPrice());
        return flightDTO;
    }

    public Flight toEntity(FlightDTO flightDTO) {
        Flight flight = new Flight();
        flight.setFlightId(flightDTO.getFlightId());
        flight.setFlightNumber(flightDTO.getFlightNumber());
        flight.setRouteId(flightDTO.getRouteId());
        flight.setDepartureTime(flightDTO.getDepartureTime());
        flight.setArrivalTime(flightDTO.getArrivalTime());
        flight.setStatus(flightDTO.getStatus());
        flight.setArrivalCity(flightDTO.getArrivalCity());
        flight.setDepartureCity(flightDTO.getDepartureCity());
        flight.setPrice(flightDTO.getPrice());

        return flight;
    }
}
