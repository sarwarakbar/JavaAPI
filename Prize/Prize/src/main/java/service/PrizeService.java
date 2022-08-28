package service;

import java.util.List;

import entity.Prize;





public interface PrizeService {
	
	List<Prize> findAll();
	
	Prize findById(int id);
	
	Prize Save(Prize prize);
	
	Prize Update(Prize prize, int id);
	
	Iterable<Prize> saveAll(List<Prize> prizes);
	
	Prize DeleteById(Prize prize, int id);
	
	
	List<Prize> findAllByOrderByYearAsc();
	
	List<Prize> findAllByOrderByYearDesc();

}
