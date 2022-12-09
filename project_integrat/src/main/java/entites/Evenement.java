package entites;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Evenement {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String nom_event ;
	private String cetegorie ;
	private Date date ;
	private String adresse ;
	
	public Evenement() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom_event() {
		return nom_event;
	}

	public void setNom_event(String nom_event) {
		this.nom_event = nom_event;
	}

	public String getCetegorie() {
		return cetegorie;
	}

	public void setCetegorie(String cetegorie) {
		this.cetegorie = cetegorie;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	
	

}
