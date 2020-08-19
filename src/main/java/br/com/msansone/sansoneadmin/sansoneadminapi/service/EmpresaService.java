package br.com.msansone.sansoneadmin.sansoneadminapi.service;

import java.util.List;
import java.util.Optional;

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

	public Empresa addEmpresa(Empresa empresa) {
		return empresaRepository.save(empresa);
	}

	public Empresa getById(Long id) {
		Optional<Empresa> empresa = empresaRepository.findById(id);
		return empresa.isPresent()?empresa.get():null;
	}

	public Empresa updtEmpresa(long id, Empresa empresa) {
		
		Empresa empresaDb = getById(id);
		
		if (empresaDb==null) {
			return null;
		} else {
			empresaDb.setNome(empresa.getNome());
			empresaDb.setDescricao(empresa.getDescricao());
			return empresaRepository.save(empresaDb);
		}
		
	}

}
