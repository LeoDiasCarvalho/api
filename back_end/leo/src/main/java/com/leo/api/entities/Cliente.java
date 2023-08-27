package com.leo.api.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
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
	
}
