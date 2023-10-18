package com.example.flightmanagement.controllers;

import com.example.flightmanagement.entities.Flight;
import com.example.flightmanagement.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{flightId}")
    public Flight getFlightById(@PathVariable Integer flightId) {
        return flightService.getFlightById(flightId);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @PutMapping("/{flightId}")
    public Flight updateFlight(@PathVariable Integer flightId, @RequestBody Flight flight) {
        return flightService.updateFlight(flightId, flight);
    }

    @DeleteMapping("/{flightId}")
    public void deleteFlight(@PathVariable Integer flightId) {
        flightService.deleteFlight(flightId);
    }
}
