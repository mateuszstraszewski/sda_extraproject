package pl.mstraszewski.extraproject.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity(name  = "stations")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Station
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String stationName;
    // Geographical coordinates
    private String location;
    private Long capacity;


    //@OneToMany(mappedBy = "station", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //@JsonManagedReference
//    @JoinColumn(name = "station_id")
    //private List<Bike> bikesAvailable;
}
