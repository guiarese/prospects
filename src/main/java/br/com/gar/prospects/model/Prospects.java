package br.com.gar.prospects.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.gar.prospects.model.dto.ProspectsRequestDTO;

@Document(collection = "prospects")
public class Prospects {
	
	@Id
	private String idProspects;
	private String nameProspect;
	
	//email, age, location, dateIncluded, list of interests (order by greatest to lowest), notes
	
	public Prospects() {
		
	}
	
	public Prospects(String prospectId, ProspectsRequestDTO prospectsDTO) {
		this.setIdProspects(prospectId);
		this.setNameProspect(prospectsDTO.getNameProspect());
	}
	
	public Prospects(ProspectsRequestDTO prospectsDTO) {
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
	
	@Override
	public boolean equals(Object obj) {
		Prospects otherProspect = (Prospects) obj;
		if (this.idProspects.equals(otherProspect.idProspects) && 
				this.nameProspect.equals(otherProspect.nameProspect)) {
			return true;
		}
		return false;		
	}

}
