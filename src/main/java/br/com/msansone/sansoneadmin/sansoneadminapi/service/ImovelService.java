package br.com.msansone.sansoneadmin.sansoneadminapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Imovel;
import br.com.msansone.sansoneadmin.sansoneadminapi.repository.ImovelRepository;

@Service
public class ImovelService {
	
	@Autowired
	ImovelRepository imovelRepository;

	public List<Imovel> getImoveisByUsuarioID(Long usuarioId) {
		return imovelRepository.findAllByProprietarioUsuarioId(usuarioId);
	}

	public Imovel getImoveisByID(Long id) {
		return imovelRepository.findById(id).isPresent()?imovelRepository.findById(id).get():null;
	}

	public void deleteImoveisByID(Long id) {
		imovelRepository.deleteById(id);
	}

	public Imovel addImovel(Imovel imovel) {
		return imovelRepository.save(imovel);
	}

	public List<Imovel> getImoveisByProprietarioID(Long proprietarioId) {
		return imovelRepository.findAllByProprietarioId(proprietarioId);
	}

}
