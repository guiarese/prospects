package br.com.gar.prospects.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.gar.prospects.model.Interest;
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
		prospects.getListInterests().sort(Comparator.comparing(Interest::getOrder));
		Prospects prospectSave = prospectsRepository.save(prospects);
		return new ProspectsResponseDTO(prospectSave);
	}
	
	public List<ProspectsResponseDTO> findAll(){
		return prospectsRepository.findAll().stream().map(ProspectsResponseDTO::new).collect(Collectors.toList());
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
		prospectSave = prospectsRepository.save(prospectUpdated);
		return new ProspectsResponseDTO(prospectSave);
	}

	@Override
	public void delete(String prospectId) {
		Prospects prospectSave = prospectsRepository.findById(prospectId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		prospectsRepository.deleteById(prospectSave.getIdProspects());		
	}

}
