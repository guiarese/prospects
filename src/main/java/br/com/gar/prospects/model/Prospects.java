package br.com.gar.prospects.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.gar.prospects.model.dto.ProspectsDTO;

@Document(collection = "prospects")
public class Prospects {
	
	@Id
	private String idProspects;
	private String nameProspect;
	
	public Prospects() {
		
	}
	
	public Prospects(ProspectsDTO prospectsDTO) {
		this.setIdProspects(prospectsDTO.getIdProspects());
		this.setNameProspect(prospectsDTO.getNameProspect());
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
	
	

}
