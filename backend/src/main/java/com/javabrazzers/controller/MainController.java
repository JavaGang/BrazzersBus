package com.javabrazzers.controller;
import com.javabrazzers.Service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/index")
public class MainController {



//    @Autowired
//    private UserRepository userRepo;

    @Autowired
    private TripService tripService;


//Берем с фронта параметры передаем их сервису и возвращаем то что вернул сервис

    @GetMapping
    public List<BusRoute> getTrips(@RequestParam String from, @RequestParam String to, @RequestParam LocalDateTime date){
        return tripService.getTripList(from,to,date);
    }

}

