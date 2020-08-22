package br.com.msansone.sansoneadmin.sansoneadminapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.sansoneadmin.sansoneadminapi.exception.UsuarioDuplicateException;
import br.com.msansone.sansoneadmin.sansoneadminapi.model.Usuario;
import br.com.msansone.sansoneadmin.sansoneadminapi.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario getusuarioById(Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return usuario.isPresent()?usuario.get():null;
	}

	public Usuario getusuarioByLoginAndSenha(String login, String senha) {
		Optional<Usuario> usuario = usuarioRepository.findByLoginAndSenha(login,senha);
		return usuario.isPresent()?usuario.get():null;
	}

	public Usuario addUsuario(Usuario usuario) throws UsuarioDuplicateException {
		List<Usuario> usuarios = usuarioRepository.findAllByLogin(usuario.getLogin());
		if (usuario ==null || usuarios.size()>0) {
			throw new UsuarioDuplicateException();
		}
		return usuarioRepository.save(usuario);
	}
	
	public void delUsuario(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}

	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}

}
