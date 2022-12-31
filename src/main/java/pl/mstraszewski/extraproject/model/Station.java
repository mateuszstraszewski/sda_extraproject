package pl.mstraszewski.extraproject.model;

import org.springframework.data.annotation.Id;

public class Station
{
    @Id
    private String id;
    private String stationName;

    // Geographical coordinates
    private String location;
    private String capacity;
    private String bikeCount;

}
