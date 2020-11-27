package br.com.gar.prospects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gar.prospects.model.dto.ProspectsDTO;
import br.com.gar.prospects.service.ProspectsService;

@RestController
@RequestMapping("/prospects")
public class ProspectsController {
	
	@Autowired
	private ProspectsService prospectsService;
	
	@PostMapping
	public ProspectsDTO create(@RequestBody ProspectsDTO prospectsDTO) {
		return prospectsService.create(prospectsDTO);
	}
}
