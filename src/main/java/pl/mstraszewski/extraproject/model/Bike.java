package pl.mstraszewski.extraproject.model;

import org.springframework.data.annotation.Id;

public class Bike
{
    @Id
    private String id;
    private String station;
    private String mileage;
    private String currentPosition;
    private String totalRentalTime;
}
