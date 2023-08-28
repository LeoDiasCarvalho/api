package com.leo.api.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "telefone_principal", unique = true, nullable = true)
	private String telefone_principal;
	
	@Column(name = "telefone_recado")
	private String telefone_recado;
	
	public Telefone() {
		
	}

	public Telefone(Long id, String telefone_principal, String telefone_recado) {
		this.id = id;
		this.telefone_principal = telefone_principal;
		this.telefone_recado = telefone_recado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTelefone_principal() {
		return telefone_principal;
	}

	public void setTelefone_principal(String telefone_principal) {
		this.telefone_principal = telefone_principal;
	}

	public String getTelefone_recado() {
		return telefone_recado;
	}

	public void setTelefone_recado(String telefone_recado) {
		this.telefone_recado = telefone_recado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, telefone_principal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(id, other.id) && Objects.equals(telefone_principal, other.telefone_principal);
	}
	
	

}
