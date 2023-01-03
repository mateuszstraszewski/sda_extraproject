package pl.mstraszewski.extraproject.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mstraszewski.extraproject.model.Bike;
import pl.mstraszewski.extraproject.model.Station;
import pl.mstraszewski.extraproject.repository.BikeRepository;
import pl.mstraszewski.extraproject.repository.StationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BikeService
{
    Logger logger = LogManager.getLogger();

    @Autowired
    BikeRepository bikeRepository;

    public List<Bike> getAllBikes()
    {
        List<Bike> all = bikeRepository.findAll();
        for(Bike bike : all)
        {
            logger.debug(bike.getBrand());
        }
        return all;
    }

    public void addBike(Bike bike)
    {
        bikeRepository.save(bike);
    }

    public void rentBike(Long id)
    {
        Optional<Bike> bikeById = bikeRepository.findById(id);
        Bike bike = bikeById.get();
        if (bike.getIsAvailable())
        {
            bike.setIsAvailable(false);
        }
        else
        {
            logger.error("Bike with id: " + id + " is not available!");
        }
        bikeRepository.save(bike);
    }

    public void returnBike(Long id)
    {
        Optional<Bike> bikeById = bikeRepository.findById(id);
        Bike bike = bikeById.get();
        if (!bike.getIsAvailable())
        {
            bike.setIsAvailable(true);
        }
        else
        {
            logger.error("Bike with id: " + id + " has been already returned!");
        }
        bikeRepository.save(bike);
    }

    public void deleteBike(Long id)
    {
        Optional<Bike> bikeById = bikeRepository.findById(id);
        Bike bike = bikeById.get();

        bikeRepository.delete(bike);
    }

//    public void updateBikeMileage(Bike bike, Long mileage)
//    {
//        Optional<Bike> optionalBike = bikeRepository.findById(bike.getId());
//        Bike retrievedBike = optionalBike.get();
//        retrievedBike.setMileage(retrievedBike.getMileage() + mileage);
//
//        bikeRepository.save(retrievedBike);
//    }
//
//    public void updateBikeStation(Bike bike, Station station)
//    {
//        Optional<Station> optionalStation = stationRepository.findById(station.getId());
//        Station retrievedStation = optionalStation.get();
//
//        Optional<Bike> optionalBike = bikeRepository.findById(bike.getId());
//        Bike retrievedBike = optionalBike.get();
//        //retrievedBike.setStation(retrievedStation);
//
//        bikeRepository.save(retrievedBike);
//    }
}
