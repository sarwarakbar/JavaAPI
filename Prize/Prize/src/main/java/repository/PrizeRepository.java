package repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.Prize;

@Repository
public interface PrizeRepository extends CrudRepository<Prize, Integer> {	 
	
	List<Prize> findAll();
	
	Prize findById(int id);
	
	

	List<Prize> findAllByOrderByYearAsc();
	
	List<Prize> findAllByOrderByYearDesc();

	
	

	
	 
}
