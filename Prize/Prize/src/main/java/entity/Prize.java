package entity;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="NobelPrize")
public class Prize {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private int id;
	
	
	private String year;
	
	
	private String category;
	

	private String overallMotivation;
	
	@JsonIgnore
	@Column(nullable = false, updatable = false)
	@UpdateTimestamp()
	private Date updatedDate;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="prizeId")
	private List<Laureate> laureates;
	
	public Prize() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getOverallMotivation() {
		return overallMotivation;
	}

	public void setOverallMotivation(String overallMotivation) {
		this.overallMotivation = overallMotivation;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<Laureate> getLaureates() {
		return laureates;
	}

	public void setLaureates(List<Laureate> laureates) {
		this.laureates = laureates;
	}

	@Override
	public String toString() {
		return "Prize [id=" + id + ", year=" + year + ", category=" + category + ", overallMotivation="
				+ overallMotivation + ", updatedDate=" + updatedDate + ", laureates=" + laureates + "]";
	}
	
	
}