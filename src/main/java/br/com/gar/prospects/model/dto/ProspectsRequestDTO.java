package br.com.gar.prospects.model.dto;

import java.util.Date;
import java.util.List;

import br.com.gar.prospects.model.Interest;
import br.com.gar.prospects.model.Prospects;

public class ProspectsRequestDTO {
	
	private String nameProspect;
	private String emailProspect;
	private int ageProspect;
	private String locationProspect;
	private Date dateIncludedProspect;
	private List<Interest> listInterests;
	
	public ProspectsRequestDTO() {
		
	}
	
	public ProspectsRequestDTO(Prospects prospects) {
		this.setNameProspect(prospects.getNameProspect());
		this.setEmailProspect(prospects.getEmailProspect());
		this.setAgeProspect(prospects.getAgeProspect());
		this.setLocationProspect(prospects.getLocationProspect());
		this.setDateIncludedProspect(prospects.getDateIncludedProspect());
		this.setListInterests(prospects.getListInterests());
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
	public List<Interest> getListInterests() {
		return listInterests;
	}
	public void setListInterests(List<Interest> listInterests) {
		this.listInterests = listInterests;
	}
	

}
