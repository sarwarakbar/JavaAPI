package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.*;


@Repository
public interface LaureateRepository extends JpaRepository<Laureate, Integer> {

	List<Laureate> findByfirstname(String firstname);
	
	List<Laureate> findByshare(String share);
	   
	
}
