package br.com.msansone.sansoneadmin.sansoneadminapi.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.sansoneadmin.sansoneadminapi.exception.UsuarioDuplicateException;
import br.com.msansone.sansoneadmin.sansoneadminapi.model.Perfil;
import br.com.msansone.sansoneadmin.sansoneadminapi.model.Usuario;
import br.com.msansone.sansoneadmin.sansoneadminapi.model.rest.ApiError;
import br.com.msansone.sansoneadmin.sansoneadminapi.service.PerfilService;
import br.com.msansone.sansoneadmin.sansoneadminapi.service.UsuarioService;

@RestController
@RequestMapping("/sansoneadmin/seguranca")
//@CrossOrigin(origins = "http://164.68.103.142:5000")
@PropertySource("classpath:message.properties")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SegurancaController {
	
	private static Logger LOG = Logger.getLogger("SegurancaController");
	
	
	@Value("${login.duplicado}")
	private String loginDuplicado;

	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	PerfilService perfilService;
	
	@GetMapping("/usuario/{id}")
	public Usuario getusuarioById(@PathVariable Long id) {
		LOG.info("GET - /sansoneadmin/seguranca/usuario/"+id);
		return usuarioService.getusuarioById(id);
	}
	
	@GetMapping("/usuario")
	public List<Usuario> getAllUsuario() {
		LOG.info("GET - /sansoneadmin/seguranca/usuario");
		return usuarioService.getAllUsuarios();
	}
	
	@GetMapping("/perfil")
	public List<Perfil> getAllPerfil() {
		LOG.info("GET - /sansoneadmin/seguranca/perfil");
		return perfilService.getAll();
	}
	
	
	@PostMapping("/login")
	public Usuario getusuarioByoginlAndSenha(@RequestBody Usuario usuario) {
		LOG.info("POST - /sansoneadmin/seguranca/login/");
		return usuarioService.getusuarioByLoginAndSenha(usuario.getLogin(), usuario.getSenha());
	}
	
	@PostMapping("/usuario")
	public ResponseEntity<Object> addUsuario(@RequestBody Usuario usuario) {
		LOG.info("POST - /sansoneadmin/seguranca/usuario/");
		ResponseEntity<Object> saida = null;
		try {
			saida= new ResponseEntity<Object>(usuarioService.addUsuario(usuario), HttpStatus.OK);
		} catch (UsuarioDuplicateException e) {
			saida= new ResponseEntity<Object>( new ApiError(loginDuplicado, "") , HttpStatus.BAD_REQUEST);
			e.printStackTrace();
		}
		return saida;
	}
	
	
	@DeleteMapping("/usuario")
	public void delUsuario(@RequestBody Usuario usuario) {
		LOG.info("DELETE - /sansoneadmin/seguranca/login/");
		usuarioService.delUsuario(usuario);
	}

}
