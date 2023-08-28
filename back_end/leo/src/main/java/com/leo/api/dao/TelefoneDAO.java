package com.leo.api.dao;

import com.leo.api.entities.Telefone;

public class TelefoneDAO {
	
	private Long id;
	private String telefone_principal;
	private String telefone_recado;
	
	public TelefoneDAO() {
	}
	
	public TelefoneDAO(Telefone telefone) {
		id = telefone.getId();
		telefone_principal = telefone.getTelefone_principal();
		telefone_recado = telefone.getTelefone_recado();
	}

	public Long getId() {
		return id;
	}

	public String getTelefone_principal() {
		return telefone_principal;
	}

	public String getTelefone_recado() {
		return telefone_recado;
	}

}
