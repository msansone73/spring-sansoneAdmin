package br.com.msansone.sansoneadmin.sansoneadminapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
