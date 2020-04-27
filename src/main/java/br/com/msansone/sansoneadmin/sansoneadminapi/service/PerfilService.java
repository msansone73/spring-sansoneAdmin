package br.com.msansone.sansoneadmin.sansoneadminapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Perfil;
import br.com.msansone.sansoneadmin.sansoneadminapi.repository.PerfilRepository;

@Service
public class PerfilService {
	
	@Autowired
	PerfilRepository perfilRepository;

	public List<Perfil> getAll() {
		return perfilRepository.findAll();
	}

}
