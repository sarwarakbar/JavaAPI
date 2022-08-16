package com.prize.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

public class Laureate 
{
	@Id
    @Column
	public int LaureateId;
	@Column
	public String RemoteIdentifier;
	@Column
    public String firstname;
	@Column
    public String surname;
	@Column
    public String motivation;
	@Column
    public String share;
    @Id
    @Column
    public int PrizeId;
    
    public Prize Prize;
    
    public int getLaureateId(){return LaureateId;} 
    public void setLaureateId(int LaureateId) {this.LaureateId = LaureateId;} 
    
    public String getRemoteIdetifier(){return RemoteIdentifier;} 
    public void setRemoteIdetifier(String RemoteIdentifier) { this.RemoteIdentifier = RemoteIdentifier;}
   	 	        
    public String getfirstname() {return firstname;}
    public void setYear(String firstname) { this.firstname = firstname;}
    
    public String getsurname() {return surname;}
    public void setsurname(String surname) { this.surname = surname;}
    
    public String getmotivation() {return motivation;}
    public void setmotivation(String motivation) { this.motivation = motivation;}
    
    public String getshare() {return share;}
    public void setshare(String share) { this.share = share;}
   	
    public int getPrizeId(){return PrizeId;} 
    public void setPrizeId(int PrizeId) {this.PrizeId = PrizeId;} 
    
    public Prize getPrize(){return Prize;} 
    public void setPrizeId(Prize Prize) {this.Prize = Prize;} 
    
    
    
    
    
    
   	
    
    
    
   	
    
    
    
    
    
    
   	
    
}


