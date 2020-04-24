package br.com.msansone.sansoneadmin.sansoneadminapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByEmailAndSenha(String email, String senha);

	List<Usuario> findAllByEmail(String email);

}
