package br.com.msansone.sansoneadmin.sansoneadminapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
