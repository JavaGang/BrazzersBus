package com.javabrazzers.Service;

import com.javabrazzers.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


//Логика класса Trip (рейсы)
@Service
public class TripService {
 @Autowired
    private TripRepository tripRepository;

//  возвращаем лист рейсов по запросу откуда, куда, и дата.
    // как по мне когда  ищут дату не плохоб было, что бы показывало  не только в этот день автобусы, а  и что бы +- день
    // так как  миждународные  рейсы тяжело угадать  точный день отправления ии тупо клаццать каждый не удобно
    // я  например когда  самолетом лететь собирался пока нашел день рейса чтоб посмотреть билеты  норм так попател.
 public List<Trip> getTripList(String from, String to, LocalDateTime departureDate){
     LocalDateTime dateMin = departureDate.minusDays(1);
     LocalDateTime dateMax = departureDate.plusDays(1);

     return tripRepository.findByFromAndToAndDepartureDateBetween(from, to, dateMin, dateMax);
 }
}
