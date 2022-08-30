package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import entity.Laureate;
import entity.Prize;

import repository.LaureateRepository;
import repository.PrizeRepository;



@Service
public class PrizeServiceImpl implements PrizeService {

	@Autowired
	private PrizeRepository prizeRepository;
	
	@Autowired
	private LaureateRepository laureateRepository;
	
	public List<Prize> findAll(){
    	//return (List<Prize>) prizeRepository.findAll();
		return prizeRepository.findAll();
    }
	
	public Prize findById(int id) {
		return prizeRepository.findById(id);
	}	
	
	
	public List<Prize> findAllByOrderByYearAsc(){
		return  prizeRepository.findAllByOrderByYearAsc();
		
	}
	
	public List<Prize> findAllByOrderByYearDesc(){
		return prizeRepository.findAllByOrderByYearDesc();
		
		
	}

	@Override
	public Prize Save(Prize prize) {
		prizeRepository.save(prize);
		return null;
	}

	@Override
	public Iterable<Prize> saveAll(List<Prize> prizes) {
		
		return prizeRepository.saveAll(prizes);
	}



	@Override
	public Prize Update(Prize prize, int id) {
		Prize existingPrize = prizeRepository.findById(id);
		existingPrize.setCategory(prize.getCategory());
		existingPrize.setYear(prize.getYear());
		existingPrize.setOverallMotivation(prize.getOverallMotivation());
		existingPrize.setLaureates(prize.getLaureates());		
		//Save to Database
		prizeRepository.save(existingPrize);
		return null;
	}

	@Override
	public void DeleteById(int id) {
		
		prizeRepository.findById(id);		
		prizeRepository.deleteById(id);
		
	}

	@Override
	public List<Laureate> findByfirstname(String firstname) {
	
		return laureateRepository.findByfirstname(firstname);
	}

	@Override
	public List<Laureate> findByshare(String share) {
		
		return laureateRepository.findByshare(share);
	}

	
	
	public List<Prize> findByCategoryOrYearOrLaureates_Firstname(String name, String category, String year){
		List<Prize> prizes = prizeRepository.findByCategoryOrYearOrLaureates_Firstname(name, category, year);
		//to do
		//Play after single JPA call and perform necessary sorting based on name/year and
		//number of share per prize, using stream API..		
		return prizes;
	}


}

