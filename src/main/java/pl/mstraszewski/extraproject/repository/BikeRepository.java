package pl.mstraszewski.extraproject.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mstraszewski.extraproject.model.Bike;

import java.util.List;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long>
{

}
