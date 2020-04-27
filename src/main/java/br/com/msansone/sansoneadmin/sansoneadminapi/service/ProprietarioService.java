package br.com.msansone.sansoneadmin.sansoneadminapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Proprietario;
import br.com.msansone.sansoneadmin.sansoneadminapi.repository.ProprietarioRepository;

@Service
public class ProprietarioService {
	
	@Autowired
	ProprietarioRepository proprietarioRepository; 

	public List<Proprietario> getAllByUsuarioId(Long id) {
		return proprietarioRepository.findAllByUsuarioId(id);
	}

	public Proprietario addProprietario(Proprietario proprietario) {
		return proprietarioRepository.save(proprietario);
	}

	public Proprietario getAllById(Long id) {
		Optional<Proprietario> proprietario = proprietarioRepository.findById(id);
		return proprietario.isPresent()?proprietario.get():null;
	}

	public void deleteProprietario(Long id) {
		proprietarioRepository.deleteById(id);		
	}

}
