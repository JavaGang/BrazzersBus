package com.javabrazzers.repository;


import com.javabrazzers.domain.BusRoute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;


//вывод лист рейсовкоторый отвечают парраметрам: куда, где, между минимальной датой и максимальной датой
// (не уверен что правильно написано, нада потестить с готовой базой)
public interface BusRouteRepository extends JpaRepository<BusRoute, Long> {
    List<BusRoute> findByDepartureAndArrivalAndDepartureTimeBetween (String from, String to, LocalDateTime dateMin, LocalDateTime dateMax );
}
