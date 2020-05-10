package br.com.msansone.sansoneadmin.sansoneadminapi.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Contrato;
import br.com.msansone.sansoneadmin.sansoneadminapi.service.ContratoService;

@RestController
@RequestMapping("/sansoneadmin")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContratoController {
	
	private static Logger LOG = Logger.getLogger("ContratoController");
	
	@Autowired
	ContratoService contratoService;
	
	@GetMapping("/contrato/imovel/{idImovel}")
	public List<Contrato> getContratosByImovelId(@PathVariable Long idImovel){
		return contratoService.getByImovelId(idImovel);
	}

}
