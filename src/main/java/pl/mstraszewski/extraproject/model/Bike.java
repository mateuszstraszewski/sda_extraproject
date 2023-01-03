package pl.mstraszewski.extraproject.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Bike
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@ManyToOne
    //@JoinColumn(name="station_id")
    //@JsonBackReference
    //private Station station;

    private String brand;
    private Long mileage;
    private String currentPosition;
    private String totalRentalTime;

    @Column(nullable = false)
    private Boolean isAvailable = true;
}
