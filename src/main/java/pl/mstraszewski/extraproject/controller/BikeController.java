package pl.mstraszewski.extraproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mstraszewski.extraproject.PrepareData;
import pl.mstraszewski.extraproject.model.Bike;
import pl.mstraszewski.extraproject.service.BikeService;
import pl.mstraszewski.extraproject.service.StationService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bike")
@CrossOrigin("*")
public class BikeController
{
    @Autowired
    BikeService bikeService;

    @Autowired
    PrepareData prepareData;

    @GetMapping("/getAllBikes")
    public List<Bike> getAllBikes()
    {
        return bikeService.getAllBikes();
    }

    @GetMapping("/prepare")
    public void prepareData()
    {
        prepareData.prepareData();
    }

    @GetMapping("/rentBike/{id}")
    public void rentBike(@PathVariable Long id)
    {
        bikeService.rentBike(id);
    }

    @GetMapping("/returnBike/{id}")
    public void returnBike(@PathVariable Long id)
    {
        bikeService.returnBike(id);
    }

    @PostMapping(value = "/addNewBike")
    public void addNewBike(@RequestBody Bike bike)
    {
        bikeService.addBike(bike);
    }

    @DeleteMapping("deleteBike/{id}")
    public String deleteBike(@PathVariable("id") Long id)
    {
        bikeService.deleteBike(id);
        return "Delete successful";
    }


}
