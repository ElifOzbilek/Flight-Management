package com.example.flightmanagement.controllers;

import com.example.flightmanagement.entities.Route;
import com.example.flightmanagement.service.RouteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteController {

    final RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }
    @GetMapping
    public List<Route> getAllRoutes() {
        return routeService.getAllRoutes();
    }

    @GetMapping("/{routeId}")
    public Route getRouteById(@PathVariable Long routeId) {
        return routeService.getRouteById(routeId);
    }

    @PostMapping
    public Route createRoute(@RequestBody Route route) {
        return routeService.createRoute(route);
    }

    @PutMapping("/{routeId}")
    public Route updateRoute(@PathVariable Long routeId, @RequestBody Route route) {
        return routeService.updateRoute(routeId, route);
    }

    @DeleteMapping("/{routeId}")
    public void deleteRoute(@PathVariable Long routeId) {
        routeService.deleteRoute(routeId);
    }
}
