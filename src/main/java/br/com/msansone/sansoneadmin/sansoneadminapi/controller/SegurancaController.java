package br.com.msansone.sansoneadmin.sansoneadminapi.controller;

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

import br.com.msansone.sansoneadmin.sansoneadminapi.exception.UsuarioDuplicateException;
import br.com.msansone.sansoneadmin.sansoneadminapi.model.Usuario;
import br.com.msansone.sansoneadmin.sansoneadminapi.service.UsuarioService;

@RestController
@RequestMapping("/sansoneadmin/seguranca")
//@CrossOrigin(origins = "http://164.68.103.142:5000")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SegurancaController {
	
	private static Logger LOG = Logger.getLogger("SegurancaController");
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/usuario/{id}")
	public Usuario getusuarioById(@PathVariable Long id) {
		LOG.info("GET - /sansoneadmin/seguranca/usuario/"+id);
		return usuarioService.getusuarioById(id);
	}
	
	@PostMapping("/login")
	public Usuario getusuarioByoginlAndSenha(@RequestBody Usuario usuario) {
		LOG.info("POST - /sansoneadmin/seguranca/login/");
		return usuarioService.getusuarioByLoginAndSenha(usuario.getLogin(), usuario.getSenha());
	}
	
	@PostMapping("/usuario")
	public Usuario addUsuario(@RequestBody Usuario usuario) throws UsuarioDuplicateException {
		LOG.info("POST - /sansoneadmin/seguranca/usuario/");
		return usuarioService.addUsuario(usuario);
	}
	
	@DeleteMapping("/usuario")
	public void delUsuario(@RequestBody Usuario usuario) {
		LOG.info("DELETE - /sansoneadmin/seguranca/login/");
		usuarioService.delUsuario(usuario);
	}

}
