package br.com.gar.prospects.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gar.prospects.model.Prospects;
import br.com.gar.prospects.model.dto.ProspectsDTO;
import br.com.gar.prospects.repository.ProspectsRepository;
import br.com.gar.prospects.service.ProspectsService;

@Service
public class ProspectServiceImpl implements ProspectsService{
	
	@Autowired
	private ProspectsRepository prospectsRepository;

	@Override
	public ProspectsDTO create(ProspectsDTO prospectsDTO) {
		Prospects prospects = new Prospects(prospectsDTO);
		Prospects prospectsSave = prospectsRepository.save(prospects);
		return new ProspectsDTO(prospectsSave);
	}

}
