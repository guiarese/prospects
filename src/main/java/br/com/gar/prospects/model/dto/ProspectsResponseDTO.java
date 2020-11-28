package br.com.gar.prospects.model.dto;

import br.com.gar.prospects.model.Prospects;

public class ProspectsResponseDTO {
	
	private String idProspects;
	private String nameProspect;
	
	public ProspectsResponseDTO() {
		
	}
	
	public ProspectsResponseDTO(Prospects prospects) {
		this.setIdProspects(prospects.getIdProspects());
		this.setNameProspect(prospects.getNameProspect());
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
