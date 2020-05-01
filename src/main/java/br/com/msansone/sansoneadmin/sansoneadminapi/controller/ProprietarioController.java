package br.com.msansone.sansoneadmin.sansoneadminapi.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@CrossOrigin(origins = "http://164.68.103.142:3000/", allowedHeaders = "*")
public class ProprietarioController {
	

	private static Logger LOG = Logger.getLogger("ProprietarioController");
	
	@Autowired
	ProprietarioService proprietarioService;
	
	@GetMapping("/proprietario/usuario/{id}")
	public List<Proprietario> getAllByUsuarioId(@PathVariable Long id) {
		LOG.info("GET - /sansoneadmin/proprietario/usuario/"+id);
		return proprietarioService.getAllByUsuarioId(id);
		
	} 
	
	@GetMapping("/proprietario/{id}")
	public Proprietario getAllById(@PathVariable Long id) {
		LOG.info("POST - /sansoneadmin/proprietario/"+id);
		return proprietarioService.getAllById(id);
		
	} 
	
	@PostMapping("/proprietario")
	public Proprietario addProprietario(@RequestBody Proprietario proprietario) {
		LOG.info("POST - /sansoneadmin/proprietario/usuario/");
		return proprietarioService.addProprietario(proprietario);
	}
	
	@DeleteMapping("/proprietario/{id}")
	public void delProprietario(@PathVariable Long id) {
		LOG.info("DELETE - /sansoneadmin/proprietario/usuario/"+id);
		proprietarioService.deleteProprietario(id);
	}
	
	
	

}
