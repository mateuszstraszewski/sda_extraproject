package pl.mstraszewski.extraproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.mstraszewski.extraproject.model.Bike;
import pl.mstraszewski.extraproject.model.Station;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExtraprojectApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(ExtraprojectApplication.class, args);
	}
}
