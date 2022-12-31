package pl.mstraszewski.extraproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mstraszewski.extraproject.model.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
}
