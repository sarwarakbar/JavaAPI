package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.Prize;

import repository.PrizeRepository;



@Service
public class PrizeServiceImpl implements PrizeService {

	@Autowired
	private PrizeRepository prizeRepository;
	
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
	
	
}
