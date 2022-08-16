package com.prize.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Prize 
{
	 	@Id
	    @Column
		public int PrizeId;
	 	@Column
	 	public String year;
	 	@Column
	    public String category;
	 	
	    public List<Laureate> laureates;
	    @Column
	    public String overallMotivation;
	    
 public int getId() 
 {
	 return PrizeId;	    
 }
 
 public void setId(int PrizeId) 
 {
	this.PrizeId = PrizeId;
 }
	     
 public String getYear() 
 {
	return year;
 }
 
 public void setYear(String year) 
 {
	this.year = year;
 }
		     
 public String getCategory() 
 {
	return category;
 }
 
 public void setCategory(String category) 
 {
	this.category = category;
 }
			     
 public List<Laureate> getList() 
 {
	return laureates;
 }
 
 public void setList(List<Laureate> laureates)
 {
    this.laureates = laureates;
 }
	     
 public String getOverallMotivation() 
 {
	return overallMotivation;
 }
 
 public void setOverallMotivation(String overallMotivation) 
 {
	this.overallMotivation = overallMotivation;
 }
	    

}
