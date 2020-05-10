package br.com.msansone.sansoneadmin.sansoneadminapi.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Inquilino;
import br.com.msansone.sansoneadmin.sansoneadminapi.service.InquilinoService;

@RestController
@RequestMapping("/sansoneadmin")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InquilinoController {
	
	private static Logger LOG = Logger.getLogger("InquilinoController");
	
	@Autowired
	InquilinoService inquilinoService;
	
	@GetMapping("/inquilino/{id}")
	public Inquilino getById(@PathVariable Long id) {
		return inquilinoService.getById(id);
	}
	
	@PostMapping("/inquilino")
	public Inquilino saveInquinilo(@RequestBody Inquilino inquilino) {
		return inquilinoService.salvar(inquilino);
	}
	

}
