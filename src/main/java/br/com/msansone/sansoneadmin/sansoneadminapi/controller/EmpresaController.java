package br.com.msansone.sansoneadmin.sansoneadminapi.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Empresa;
import br.com.msansone.sansoneadmin.sansoneadminapi.model.Perfil;
import br.com.msansone.sansoneadmin.sansoneadminapi.service.EmpresaService;
import br.com.msansone.sansoneadmin.sansoneadminapi.service.PerfilService;

@RestController
@RequestMapping("/sansoneadmin")
//@CrossOrigin(origins = "http://164.68.103.142:5000")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmpresaController {
	
	private static Logger LOG = Logger.getLogger("EmpresaController");
	
	@Autowired
	EmpresaService empresaService;
	
	@Autowired
	PerfilService perfilService;

	@GetMapping("empresa")
	public List<Empresa> listEmpresas() {
		LOG.info("GET - /sansoneadmin/empresa");
		return empresaService.getAll();
	}
	
	@GetMapping("perfil")
	public List<Perfil> listPerfis() {
		LOG.info("GET - /sansoneadmin/perfil");
		return perfilService.getAll();
	}

}
