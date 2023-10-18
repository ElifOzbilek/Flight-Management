package com.example.flightmanagement.controllers;

import com.example.flightmanagement.entities.Airport;
import com.example.flightmanagement.service.AirportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airport")
public class AirportController {
    final AirportService airportService;


    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }
    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @GetMapping("/{airportId}")
    public Airport getAirportById(@PathVariable Long airportId) {
        return airportService.getAirportById(airportId);
    }

    @PostMapping
    public Airport createAirport(@RequestBody Airport airport) {
        return airportService.createAirport(airport);
    }

    @PutMapping("/{airportId}")
    public Airport updateAirport(@PathVariable Long airportId, @RequestBody Airport airport) {
        return airportService.updateAirport(airportId, airport);
    }

    @DeleteMapping("/{airportId}")
    public void deleteAirport(@PathVariable Long airportId) {
        airportService.deleteAirport(airportId);
    }
}
