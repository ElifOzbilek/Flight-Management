package com.example.flightmanagement.service;

import com.example.flightmanagement.entities.Flight;
import com.example.flightmanagement.repositories.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }


    public Flight getFlightById(Integer flightId) {
        return flightRepository.findById(flightId).orElse(null);
    }


    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }


    public Flight updateFlight(Integer flightId, Flight flight) {
        if (flightRepository.existsById(flightId)) {
            flight.setFlightId(flightId);
            return flightRepository.save(flight);
        }
        return null;
    }
    public void deleteFlight(Integer flightId) {
        flightRepository.deleteById(flightId);
    }


}
