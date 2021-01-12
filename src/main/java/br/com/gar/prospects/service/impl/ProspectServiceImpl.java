package br.com.gar.prospects.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.gar.prospects.model.Prospects;
import br.com.gar.prospects.model.dto.ProspectsRequestDTO;
import br.com.gar.prospects.model.dto.ProspectsResponseDTO;
import br.com.gar.prospects.repository.ProspectsRepository;
import br.com.gar.prospects.service.ProspectsService;

@Service
public class ProspectServiceImpl implements ProspectsService{
	
	@Autowired
	private ProspectsRepository prospectsRepository;

	@Override
	public ProspectsResponseDTO create(ProspectsRequestDTO prospectsDTO) {
		Prospects prospects = new Prospects(prospectsDTO);
		Prospects prospectSave = prospectsRepository.save(prospects);
		return new ProspectsResponseDTO(prospectSave);
	}

	@Override
	public ProspectsResponseDTO findById(String prospectId) {
		Prospects prospectSave = prospectsRepository.findById(prospectId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		return new ProspectsResponseDTO(prospectSave);
	}

	@Override
	public ProspectsResponseDTO update(String prospectId, ProspectsRequestDTO prospectDTO) {
		Prospects prospectSave = prospectsRepository.findById(prospectId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		Prospects prospectUpdated = new Prospects(prospectId,prospectDTO);
		if (prospectSave.equals(prospectUpdated)) throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Não existem alterações a serem salvas");
		//ajustar message
		prospectSave = prospectsRepository.save(prospectUpdated);
		return new ProspectsResponseDTO(prospectSave);
	}

	@Override
	public void delete(String prospectId) {
		Prospects prospectSave = prospectsRepository.findById(prospectId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		prospectsRepository.deleteById(prospectSave.getIdProspects());		
	}

}
