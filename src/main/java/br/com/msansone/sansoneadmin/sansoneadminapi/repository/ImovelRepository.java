package br.com.msansone.sansoneadmin.sansoneadminapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

}
