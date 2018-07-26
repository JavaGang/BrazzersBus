package com.javabrazzers.controller;

import com.javabrazzers.domain.User;
import com.javabrazzers.repository.UserRepository;
import com.javabrazzers.service.UserService;
import jdk.internal.jline.internal.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class MainController {



//    @Autowired
//    private UserRepository userRepo;

    @Autowired
    private TripService tripService;


//Берем с фронта параметры передаем их сервису и возвращаем то что вернул сервис

    @GetMapping
    public List<Trip> getTrips(@RequestParam String from, @RequestParam String to, @RequestParam LocalDateTime date){
        return tripService.getTripList(from,to,date);
    }

}
