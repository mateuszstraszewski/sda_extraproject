package pl.mstraszewski.extraproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mstraszewski.extraproject.model.Bike;
import pl.mstraszewski.extraproject.model.Station;
import pl.mstraszewski.extraproject.repository.StationRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationService
{
    @Autowired
    StationRepository stationRepository;

    public List<Station> getAllStation()
    {
        return stationRepository.findAll();
    }

    public void addStation(Station station)
    {
        stationRepository.save(station);
    }

    public void addManyStations(List<Station> stations)
    {
        stationRepository.saveAll(stations);
    }
}
