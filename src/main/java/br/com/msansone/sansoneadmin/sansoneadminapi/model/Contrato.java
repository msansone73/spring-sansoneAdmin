package br.com.msansone.sansoneadmin.sansoneadminapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contrato extends ModelAbstract {

	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_imovel")
	private Imovel imovel;

	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name ="id_inquilino")
	private Inquilino inquilino;
	
	@Column(nullable = false)
	private LocalDate dataInicio;
	
	@Column(nullable = false)	
	private Integer carencia;
	
	@Column(nullable = false)
	private BigDecimal valAluguel;
	
	@Column(nullable = false)
	private GarantiaType garantiaType;
	
	@Column(nullable = true, length = 3000)
	private String garantiaDescricao;

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Inquilino getInquilino() {
		return inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Integer getCarencia() {
		return carencia;
	}

	public void setCarencia(Integer carencia) {
		this.carencia = carencia;
	}

	public BigDecimal getValAluguel() {
		return valAluguel;
	}

	public void setValAluguel(BigDecimal valAluguel) {
		this.valAluguel = valAluguel;
	}

	public GarantiaType getGarantiaType() {
		return garantiaType;
	}

	public void setGarantiaType(GarantiaType garantiaType) {
		this.garantiaType = garantiaType;
	}

	public String getGarantiaDescricao() {
		return garantiaDescricao;
	}

	public void setGarantiaDescricao(String garantiaDescricao) {
		this.garantiaDescricao = garantiaDescricao;
	}
	
	
	
	
}
