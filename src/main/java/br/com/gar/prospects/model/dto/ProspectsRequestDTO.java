package br.com.gar.prospects.model.dto;

import br.com.gar.prospects.model.Prospects;

public class ProspectsRequestDTO {
	
	private String nameProspect;
	
	public ProspectsRequestDTO() {
		
	}
	
	public ProspectsRequestDTO(Prospects prospects) {
		this.setNameProspect(prospects.getNameProspect());
	}
	
	public String getNameProspect() {
		return nameProspect;
	}
	public void setNameProspect(String nameProspect) {
		this.nameProspect = nameProspect;
	}

}
