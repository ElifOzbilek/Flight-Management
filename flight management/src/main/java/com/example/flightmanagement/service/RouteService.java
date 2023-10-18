package com.example.flightmanagement.service;

import com.example.flightmanagement.entities.Route;
import com.example.flightmanagement.repositories.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    final RouteRepository routeRepository;
    public RouteService(RouteRepository routeRepository){
        this.routeRepository = routeRepository;
    }
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Route getRouteById(Long routeId) {
        return routeRepository.findById(routeId).orElse(null);
    }

    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    public Route updateRoute(Long routeId, Route route) {
        if (routeRepository.existsById(routeId)) {
            route.setRouteId(routeId);
            return routeRepository.save(route);
        }
        return null;
    }

    public void deleteRoute(Long routeId) {
        routeRepository.deleteById(routeId);
    }
}

