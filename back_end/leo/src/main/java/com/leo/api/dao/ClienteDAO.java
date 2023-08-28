package com.leo.api.dao;

import java.util.Date;

import com.leo.api.entities.Cliente;

public class ClienteDAO {
	
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private Date data_nascimento;
	private String nome_mae;

	public ClienteDAO() {
	}

	public ClienteDAO(Cliente cliente) {
		id = cliente.getId();
		nome = cliente.getNome();
		cpf = cliente.getCpf();
		email = cliente.getEmail();
		data_nascimento = cliente.getData_nascimento();
		nome_mae = cliente.getNome_mae();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public String getNome_mae() {
		return nome_mae;
	}

	
}
