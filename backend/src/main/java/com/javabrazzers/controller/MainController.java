package com.javabrazzers.controller;
import com.javabrazzers.service.BusRouteService;
import com.javabrazzers.domain.BusRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/index")
public class MainController {

//    @Autowired
//    private UserRepository userRepo;

    @Autowired
    private BusRouteService busRouteService;


//Берем с фронта параметры передаем их сервису и возвращаем то что вернул сервис

    @GetMapping
    public List<BusRoute> getTrips(@RequestParam String from, @RequestParam String to, @RequestParam LocalDateTime date){
        return busRouteService.getTripList(from, to, date);
    }

}

