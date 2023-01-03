package pl.mstraszewski.extraproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mstraszewski.extraproject.model.Bike;
import pl.mstraszewski.extraproject.model.Station;
import pl.mstraszewski.extraproject.service.BikeService;
import pl.mstraszewski.extraproject.service.StationService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrepareData
{
    @Autowired
    BikeService bikeService;

    @Autowired
    StationService stationService;

    public void prepareData()
    {
        Station station1 = new Station();
        station1.setStationName("POZ01A");
        station1.setCapacity(10L);
        station1.setLocation("Stary Rynek 1");
        station1.setId(1L);

        stationService.addStation(station1);

        Station station2 = new Station();
        station2.setStationName("POZ02A");
        station2.setCapacity(5L);
        station2.setLocation("Głogowska 1");
        station2.setId(2L);

        stationService.addStation(station2);

        Bike bike1 = new Bike();
        bike1.setBrand("Romet");
        bike1.setMileage(0L);
        bike1.setCurrentPosition("01N01E");
        bike1.setTotalRentalTime("0");
        //bike1.setStation(station1);

        bikeService.addBike(bike1);

        Bike bike2 = new Bike();
        bike2.setBrand("Shimano");
        bike2.setMileage(0L);
        bike2.setCurrentPosition("01N01E");
        bike2.setTotalRentalTime("0");
        //bike2.setStation(station2);

        bikeService.addBike(bike2);

        Bike bike3 = new Bike();
        bike3.setBrand("Cross");
        bike3.setMileage(0L);
        bike3.setCurrentPosition("01N01E");
        bike3.setTotalRentalTime("0");
        //bike3.setStation(station2);

        bikeService.addBike(bike3);

        Bike bike4 = new Bike();
        bike4.setBrand("Specialized");
        bike4.setMileage(0L);
        bike4.setCurrentPosition("01N01E");
        bike4.setTotalRentalTime("0");
        //bike4.setStation(station2);

        bikeService.addBike(bike4);
    }

}
