package com.example.flightmanagement.repositories;

import com.example.flightmanagement.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}
