package br.com.msansone.sansoneadmin.sansoneadminapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long>{

	List<Proprietario> findAllByUsuarioId(Long id);

}
