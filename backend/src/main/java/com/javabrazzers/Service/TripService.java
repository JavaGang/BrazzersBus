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
 public List<BusRoute> getTripList(String departure, String arrival, LocalDateTime departureTime){
     LocalDateTime dateMin = departureTime.minusDays(1);
     LocalDateTime dateMax = departureTime.plusDays(1);

     return tripRepository.findByDepartureAndArrivalAndDepartureTimeBetween(departure, arrival, dateMin, dateMax);
 }
}
