package service;

import java.util.List;

import entity.Laureate;
import entity.Prize;






public interface PrizeService {
	
	List<Prize> findAll();
	
	Prize findById(int id);
	
	Prize Save(Prize prize);
	
	Prize Update(Prize prize, int id);
	
	Iterable<Prize> saveAll(List<Prize> prizes);
	
	void DeleteById(int id);	
	
	List<Prize> findAllByOrderByYearAsc();
	
	List<Prize> findAllByOrderByYearDesc();
	
	List<Laureate> findByfirstname(String firstname);
	
	List<Laureate> findByshare(String share);
	
	List<Prize> findByCategoryOrYearOrLaureates_Firstname(String name, String category, String year);
	
	
	

}
