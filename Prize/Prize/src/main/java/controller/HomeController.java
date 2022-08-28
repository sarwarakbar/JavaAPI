package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.*;

import service.PrizeService;

@RestController
@RequestMapping(path = "/api")
public class HomeController {
	
	@Autowired
	private PrizeService service;
	
	@GetMapping("/prizes/all")
	public List<Prize> getAllEmployees() {
		return service.findAll();
	}
	
	@GetMapping("/prizes/{order}")
	public List<Prize> getPrizesByYear(@PathVariable(value = "order") String order) {
		
		if(order.equals("asc")) {
			return service.findAllByOrderByYearAsc();
		} 
		else 
			
			return service.findAllByOrderByYearDesc();
		}
	
	@GetMapping("/prize/{id}")
	public Prize GetPrizeById(@PathVariable(value="id")int id) {
		return service.findById(id);
	}
	
	@PostMapping("/prize")
	public Prize addPrize(@RequestBody Prize prize) {
		service.Save(prize);
		return prize;
	}
	
	 @PutMapping("/prize/{id}")
	  public ResponseEntity<Prize> UpdatePrize(@PathVariable("id")int id, @RequestBody Prize prize){
		 return new ResponseEntity<Prize>(service.Update(prize, id), HttpStatus.OK);
	 }
		
	
	/*@DeleteMapping
	public Prize DeletePrize(Prize prize, int id) {
		service.DeleteById(prize);
		return prize;
	}*/
	 
	 
	@GetMapping("/project")
	public String GetName() {
	return "Hi! This is Sarwar. Now the new project has been started";

}
	
	@GetMapping("/project1")
	public int GetCalculation() {
		var data = 10+490;
		return data;

	}	
	  
}
