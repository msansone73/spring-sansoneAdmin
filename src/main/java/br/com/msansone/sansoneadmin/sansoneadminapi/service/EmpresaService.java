package br.com.msansone.sansoneadmin.sansoneadminapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Empresa;
import br.com.msansone.sansoneadmin.sansoneadminapi.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	EmpresaRepository empresaRepository;
	
	public List<Empresa> getAll() {
		return empresaRepository.findAll();
	}

}
