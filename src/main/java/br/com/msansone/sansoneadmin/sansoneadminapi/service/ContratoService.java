package br.com.msansone.sansoneadmin.sansoneadminapi.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.sansoneadmin.sansoneadminapi.model.Contrato;
import br.com.msansone.sansoneadmin.sansoneadminapi.repository.ContratoRepository;

@Service
public class ContratoService {
	
	@Autowired
	ContratoRepository contratoRepository;
	
	@Transactional
	public Contrato addContrato(Contrato contrato) {
		return contratoRepository.save(contrato);
	}
	
	public Contrato getById(Long id){
		Optional<Contrato> crt = contratoRepository.findById(id);
		return crt.isPresent()?crt.get():null;
	}
	
	public List<Contrato> getByImovelId(Long idImovel){
		List<Contrato> lista = contratoRepository.findAllByImovelId(idImovel);
		return lista;
	}

}
