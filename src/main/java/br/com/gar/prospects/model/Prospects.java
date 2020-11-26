package br.com.gar.prospects.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "prospects")
public class Prospects {
	
	@Id
	private String idProspects;
	private String nameProspect;
	
	public Prospects() {
		
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
