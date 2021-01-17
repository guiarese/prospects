package br.com.gar.prospects.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.gar.prospects.model.dto.ProspectsRequestDTO;

@Document(collection = "prospects")
public class Prospects {
	
	@Id
	private String idProspects;
	private String nameProspect;
	private String emailProspect;
	private int ageProspect;
	private String locationProspect;
	private Date dateIncludedProspect;
	
	//list of interests (order by greatest to lowest), notes
	
	public Prospects() {
		
	}
	
	public Prospects(String prospectId, ProspectsRequestDTO prospectsDTO) {
		this.setIdProspects(prospectId);
		this.setNameProspect(prospectsDTO.getNameProspect());
		this.setEmailProspect(prospectsDTO.getEmailProspect());
		this.setAgeProspect(prospectsDTO.getAgeProspect());
		this.setLocationProspect(prospectsDTO.getLocationProspect());
		this.setDateIncludedProspect(prospectsDTO.getDateIncludedProspect());
	}
	
	public Prospects(ProspectsRequestDTO prospectsDTO) {
		this.setNameProspect(prospectsDTO.getNameProspect());
		this.setEmailProspect(prospectsDTO.getEmailProspect());
		this.setAgeProspect(prospectsDTO.getAgeProspect());
		this.setLocationProspect(prospectsDTO.getLocationProspect());
		this.setDateIncludedProspect(prospectsDTO.getDateIncludedProspect());
	}
	
	public String getIdProspects() {
		return idProspects;
	}
	public void setIdProspects(String idProspects) {
		this.idProspects = idProspects;
	}
	public String getNameProspect() {
		return nameProspect;
	}
	public void setNameProspect(String nameProspect) {
		this.nameProspect = nameProspect;
	}
	public String getEmailProspect() {
		return emailProspect;
	}
	public void setEmailProspect(String emailProspect) {
		this.emailProspect = emailProspect;
	}
	public int getAgeProspect() {
		return ageProspect;
	}
	public void setAgeProspect(int ageProspect) {
		this.ageProspect = ageProspect;
	}
	public String getLocationProspect() {
		return locationProspect;
	}
	public void setLocationProspect(String locationProspect) {
		this.locationProspect = locationProspect;
	}
	public Date getDateIncludedProspect() {
		return dateIncludedProspect;
	}
	public void setDateIncludedProspect(Date dateIncludedProspect) {
		this.dateIncludedProspect = dateIncludedProspect;
	}

	@Override
	public boolean equals(Object obj) {
		Prospects otherProspect = (Prospects) obj;
		if (this.idProspects.equals(otherProspect.idProspects) && 
				this.nameProspect.equals(otherProspect.nameProspect) &&
				this.emailProspect.equals(otherProspect.emailProspect) &&
				this.ageProspect == otherProspect.ageProspect &&
				this.locationProspect.equals(otherProspect.locationProspect) &&
				this.dateIncludedProspect.equals(otherProspect.dateIncludedProspect)) {
			return true;
		}
		return false;		
	}

}
