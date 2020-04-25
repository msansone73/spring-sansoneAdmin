package br.com.msansone.sansoneadmin.sansoneadminapi.controller;

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
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SegurancaController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/usuario/{id}")
	public Usuario getusuarioById(@PathVariable Long id) {
		return usuarioService.getusuarioById(id);
	}
	
	@PostMapping("/login")
	public Usuario getusuarioByEmailAndSenha(@RequestBody Usuario usuario) {
		return usuarioService.getusuarioByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
	}
	
	@PostMapping("/usuario")
	public Usuario addUsuario(@RequestBody Usuario usuario) throws UsuarioDuplicateException {
		return usuarioService.addUsuario(usuario);
	}
	
	@DeleteMapping("/usuario")
	public void delUsuario(@RequestBody Usuario usuario) {
		usuarioService.delUsuario(usuario);
	}

}
