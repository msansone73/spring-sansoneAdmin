package br.com.msansone.sansoneadmin.sansoneadminapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Proprietario;
import br.com.msansone.sansoneadmin.sansoneadminapi.service.ProprietarioService;

@RestController
@RequestMapping("/sansoneadmin")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProprietarioController {
	
	@Autowired
	ProprietarioService proprietarioService;
	
	@GetMapping("/proprietario/usuario/{id}")
	public List<Proprietario> getAllByUsuarioId(@PathVariable Long id) {
		return proprietarioService.getAllByUsuarioId(id);
		
	} 
	
	@GetMapping("/proprietario/{id}")
	public Proprietario getAllById(@PathVariable Long id) {
		return proprietarioService.getAllById(id);
		
	} 
	
	@PostMapping("/proprietario")
	public Proprietario addProprietario(@RequestBody Proprietario proprietario) {
		return proprietarioService.addProprietario(proprietario);
	}

}
