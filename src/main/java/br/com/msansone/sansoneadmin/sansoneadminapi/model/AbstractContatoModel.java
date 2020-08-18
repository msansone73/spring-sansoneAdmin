package br.com.msansone.sansoneadmin.sansoneadminapi.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractContatoModel extends AbstractModel {
	
	@Column(nullable = true, length = 250)
	private String emailPessaol;

	@Column(nullable = true, length = 250)
	private String emailProfissional;

	@Column(nullable = true, length = 20)
	private String foneResidencial;

	@Column(nullable = true, length = 20)
	private String foneComercial;

	@Column(nullable = true, length = 20)
	private String celPessoal;

	@Column(nullable = true, length = 20)
	private String celProfissional;

	public String getEmailPessaol() {
		return emailPessaol;
	}

	public void setEmailPessaol(String emailPessaol) {
		this.emailPessaol = emailPessaol;
	}

	public String getEmailProfissional() {
		return emailProfissional;
	}

	public void setEmailProfissional(String emailProfissional) {
		this.emailProfissional = emailProfissional;
	}

	public String getFoneResidencial() {
		return foneResidencial;
	}

	public void setFoneResidencial(String foneResidencial) {
		this.foneResidencial = foneResidencial;
	}

	public String getFoneComercial() {
		return foneComercial;
	}

	public void setFoneComercial(String foneComercial) {
		this.foneComercial = foneComercial;
	}

	public String getCelPessoal() {
		return celPessoal;
	}

	public void setCelPessoal(String celPessoal) {
		this.celPessoal = celPessoal;
	}

	public String getCelProfissional() {
		return celProfissional;
	}

	public void setCelProfissional(String celProfissional) {
		this.celProfissional = celProfissional;
	}

	
	
}
