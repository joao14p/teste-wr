package teste.wr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import teste.wr.entity.Factories;

@Repository
public interface FactoriesRepository extends JpaRepository<Factories, Long>{

}
