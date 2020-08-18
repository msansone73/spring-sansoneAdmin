package br.com.msansone.sansoneadmin.sansoneadminapi.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Imovel extends AbstractModel {
	
	@Column(nullable = false, length = 200)
	private String Nome;
	
	@Column(nullable = true, length = 250)
	private String descricao;
	
	@Column(nullable = true, length = 250)
	private String endereco;
	
	@Column(nullable = true)
	private Integer qtdDormitorios;
	
	@Column(nullable = true)
	private Integer metragem;
	
	@Column(nullable = true)
	private BigDecimal valCompra;
	
	@Column(nullable = true)
	private BigDecimal valEstimativaAluguel;
	
	@Column(nullable = true)
	private BigDecimal valEstimativaIPTU;
	
	@Column(nullable = true)
	private BigDecimal valEstimativaCondominio;
	
	@Column(nullable = true, length = 3000)
	private String observacao;
	
	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private Proprietario proprietario;

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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getQtdDormitorios() {
		return qtdDormitorios;
	}

	public void setQtdDormitorios(Integer qtdDormitorios) {
		this.qtdDormitorios = qtdDormitorios;
	}

	public Integer getMetragem() {
		return metragem;
	}

	public void setMetragem(Integer metragem) {
		this.metragem = metragem;
	}

	public BigDecimal getValCompra() {
		return valCompra;
	}

	public void setValCompra(BigDecimal valCompra) {
		this.valCompra = valCompra;
	}

	public BigDecimal getValEstimativaAluguel() {
		return valEstimativaAluguel;
	}

	public void setValEstimativaAluguel(BigDecimal valEstimativaAluguel) {
		this.valEstimativaAluguel = valEstimativaAluguel;
	}

	public BigDecimal getValEstimativaIPTU() {
		return valEstimativaIPTU;
	}

	public void setValEstimativaIPTU(BigDecimal valEstimativaIPTU) {
		this.valEstimativaIPTU = valEstimativaIPTU;
	}

	public BigDecimal getValEstimativaCondominio() {
		return valEstimativaCondominio;
	}

	public void setValEstimativaCondominio(BigDecimal valEstimativaCondominio) {
		this.valEstimativaCondominio = valEstimativaCondominio;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	
}
