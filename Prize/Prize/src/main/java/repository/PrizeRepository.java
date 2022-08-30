package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import entity.Prize;


@Repository
public interface PrizeRepository extends JpaRepository<Prize, Integer> {	 
	
	List<Prize> findAll();
	
	Prize findById(int id);	

	List<Prize> findAllByOrderByYearAsc();
	
	List<Prize> findAllByOrderByYearDesc();
	
	List<Prize> findByCategoryOrYearOrLaureates_Firstname(String name, String category, String year);
	
	 
}
