package br.com.gar.prospects.service;

import br.com.gar.prospects.model.dto.ProspectsRequestDTO;
import br.com.gar.prospects.model.dto.ProspectsResponseDTO;

public interface ProspectsService {
	
	public ProspectsResponseDTO create(ProspectsRequestDTO prospectsDTO);
	public ProspectsResponseDTO findById(String prospectId);
	public ProspectsResponseDTO update(String prospectId, ProspectsRequestDTO prospectDTO);
	public void delete(String prospectId);

}
