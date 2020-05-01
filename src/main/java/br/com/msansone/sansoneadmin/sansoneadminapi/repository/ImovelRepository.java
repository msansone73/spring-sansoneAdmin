package br.com.msansone.sansoneadmin.sansoneadminapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

	List<Imovel> findAllByProprietarioUsuarioId(Long usaurioId);

	List<Imovel> findAllByProprietarioId(Long proprietarioId);

}
