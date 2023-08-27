package com.leo.api.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = true, unique = true)
	private Long id;
	
	@Column(name = "nome", length = 60)
	private String nome;
	
	@Column(name = "cpf", length = 15)
	private String cpf;
	
	@Column(name = "email", length = 40)
	private String email;
	
	@Column(name = "data_nascimento")
	@Temporal(TemporalType.DATE)
	private Date data_nascimento;
	
	@Column(name = "nome_mae")
	private String nome_mae;

	public Cliente() {
	}

	public Cliente(Long id, String nome, String cpf, String email, Date data_nascimento, String nome_mae) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.data_nascimento = data_nascimento;
		this.nome_mae = nome_mae;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getNome_mae() {
		return nome_mae;
	}

	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id);
	}

}
