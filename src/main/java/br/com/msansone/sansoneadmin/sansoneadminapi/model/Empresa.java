package br.com.msansone.sansoneadmin.sansoneadminapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Empresa extends AbstractModel{

	
	@Column(nullable = false, length = 200)
	private String Nome;
	
	@Column(nullable = true, length = 250)
	private String descricao;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
	
}

