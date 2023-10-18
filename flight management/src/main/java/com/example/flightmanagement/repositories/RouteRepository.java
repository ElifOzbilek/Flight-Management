package com.example.flightmanagement.repositories;

import com.example.flightmanagement.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Long> {
}
