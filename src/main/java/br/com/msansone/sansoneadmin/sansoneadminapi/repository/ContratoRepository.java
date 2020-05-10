package br.com.msansone.sansoneadmin.sansoneadminapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Long>{

	List<Contrato> findAllByImovelId(Long idImovel);

}
