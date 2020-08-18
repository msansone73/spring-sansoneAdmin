package br.com.msansone.sansoneadmin.sansoneadminapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Perfil extends AbstractModel{

	@Column(length = 200, nullable = false)
	private String nome;
	
	@Column(length = 250, nullable = false)
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
