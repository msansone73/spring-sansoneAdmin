package br.com.msansone.sansoneadmin.sansoneadminapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Inquilino;
import br.com.msansone.sansoneadmin.sansoneadminapi.repository.InquilinoRepository;

@Service
public class InquilinoService {
	
	@Autowired
	InquilinoRepository inquilinoRepository;
	
	public Inquilino salvar(Inquilino inquilino) {
		return inquilinoRepository.save(inquilino);
	}
	
	public Inquilino getById(Long id) {
		Optional<Inquilino> inquilino = inquilinoRepository.findById(id);
		return inquilino.isPresent()?inquilino.get():null;
	}
	

}


