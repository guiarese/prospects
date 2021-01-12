package br.com.gar.prospects.service;

import java.util.List;

import br.com.gar.prospects.model.dto.ProspectsRequestDTO;
import br.com.gar.prospects.model.dto.ProspectsResponseDTO;

public interface ProspectsService {
	
	public ProspectsResponseDTO create(ProspectsRequestDTO prospectsDTO);
	public List<ProspectsResponseDTO> findAll();
	public ProspectsResponseDTO findById(String prospectId);
	public ProspectsResponseDTO update(String prospectId, ProspectsRequestDTO prospectDTO);
	public void delete(String prospectId);

}
