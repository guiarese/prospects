package br.com.gar.prospects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gar.prospects.model.dto.ProspectsRequestDTO;
import br.com.gar.prospects.model.dto.ProspectsResponseDTO;
import br.com.gar.prospects.service.ProspectsService;

@RestController
@RequestMapping("/prospects")
public class ProspectsController {
	
	@Autowired
	private ProspectsService prospectsService;
	
	@PostMapping
	public ProspectsResponseDTO create(@RequestBody ProspectsRequestDTO prospectsDTO) {
		return prospectsService.create(prospectsDTO);
	}
	
	@GetMapping("/{prospectId}")
	public ProspectsResponseDTO findById(@PathVariable(name = "prospectId") String prospectId) {
		return prospectsService.findById(prospectId);
	}
	
	@PutMapping("/{prospectId}")
	public ProspectsResponseDTO update(@PathVariable(name = "prospectId") String prospectId, @RequestBody ProspectsRequestDTO prospectsRequestDTO) {
		return prospectsService.update(prospectId, prospectsRequestDTO);
	}
	
	@DeleteMapping("/{prospectId}")
	public void delete(@PathVariable String prospectId) {
		
	}
	
}
