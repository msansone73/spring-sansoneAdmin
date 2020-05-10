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

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Imovel;
import br.com.msansone.sansoneadmin.sansoneadminapi.service.ImovelService;

@RestController
@RequestMapping("/sansoneadmin")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ImovelController {
	
	private static Logger LOG = Logger.getLogger("ImovelController");
	
	@Autowired
	ImovelService imovelService;
	
	@GetMapping("/imovel/usuario/{usuarioId}")
	public List<Imovel> getImoveisByUsuarioID(@PathVariable Long usuarioId){
		LOG.info("GET - /sansoneadmin/imovel/usuario/"+usuarioId);
		return imovelService.getImoveisByUsuarioID(usuarioId);
	}
	
	@GetMapping("/imovel/proprietario/{proprietarioId}")
	public List<Imovel> getImoveisByProprietarioID(@PathVariable Long proprietarioId){
		LOG.info("GET - /sansoneadmin/imovel/proprietario/"+proprietarioId);
		return imovelService.getImoveisByProprietarioID(proprietarioId);
	}
	
	@GetMapping("/imovel/{id}")
	public Imovel getImoveisByID(@PathVariable Long id){
		LOG.info("GET - /sansoneadmin/imovel/"+id);
		return imovelService.getImoveisByID(id);
	}
	
	@DeleteMapping("/imovel/{id}")
	public void deleteImoveisByID(@PathVariable Long id){
		LOG.info("DELETE - /sansoneadmin/imovel/"+id);
		imovelService.deleteImoveisByID(id);
	}
	
	@PostMapping("/imovel")
	public Imovel saveImovel(@RequestBody Imovel imovel) {
		LOG.info("POST - /sansoneadmin/imovel");
		return imovelService.addImovel(imovel);
	}
	

}
