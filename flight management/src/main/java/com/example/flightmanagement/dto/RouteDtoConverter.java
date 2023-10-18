package com.example.flightmanagement.dto;

import com.example.flightmanagement.entities.Route;
import org.springframework.stereotype.Component;

@Component
public class RouteDtoConverter {
    public RouteDTO toDTO(Route route) {
        RouteDTO routeDTO = new RouteDTO();
        routeDTO.setRouteId(route.getRouteId());
        routeDTO.setOriginAirportId(route.getOriginAirportId());
        routeDTO.getDestinationAirportId();

        return routeDTO;
    }

    public Route toEntity(RouteDTO routeDTO) {
        Route route = new Route();
        route.setRouteId(routeDTO.getRouteId());
        route.setOriginAirportId(routeDTO.getOriginAirportId());
        route.setDestinationAirportId(routeDTO.getDestinationAirportId());
        return route;
    }
}
