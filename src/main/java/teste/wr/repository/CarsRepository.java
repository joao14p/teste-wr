package teste.wr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import teste.wr.entity.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long>{

}
