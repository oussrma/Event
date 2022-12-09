package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entites.Evenement;

public interface EventRepository extends JpaRepository<Evenement, Long>{

}
