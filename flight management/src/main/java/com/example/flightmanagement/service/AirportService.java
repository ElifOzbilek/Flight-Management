package com.example.flightmanagement.service;

import com.example.flightmanagement.entities.Airport;
import com.example.flightmanagement.repositories.AirportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {
    final AirportRepository airportRepository;
    public  AirportService(AirportRepository airportRepository){
        this.airportRepository = airportRepository;
    }
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    public Airport getAirportById(Long airportId) {
        return airportRepository.findById(airportId).orElse(null);
    }

    public Airport createAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public Airport updateAirport(Long airportId, Airport airport) {
        if (airportRepository.existsById(airportId)) {
            airport.setAirportId(airportId);
            return airportRepository.save(airport);
        }
        return null;
    }

    public void deleteAirport(Long airportId) {
        airportRepository.deleteById(airportId);
    }
}
