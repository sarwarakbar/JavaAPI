package entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Laureate {
		
	@JsonIgnore
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private int idPrize;
    
    @Column
    private String id;
	@Column
    private String firstname;
	@Column
    private String surname;   
	
	@Lob
    @Column( length = 100000 )
    private String motivation;
    @Column
    private String share;   
    
       
    public Laureate() {}  
    

	public Laureate(int idPrize, String id, String firstname, String surname, String motivation, String share ) {
		super();
		this.idPrize=idPrize;
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.motivation = motivation;
		this.share = share;
		
	}

	public int getIdPrize() {
		return idPrize;
	}


	public void setIdPrize(int idPrize) {
		this.idPrize = idPrize;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMotivation() {
		return motivation;
	}

	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}

	public String getShare() {
		return share;
	}

	public void setShare(String share) {
		this.share = share;
	}      
   
}
