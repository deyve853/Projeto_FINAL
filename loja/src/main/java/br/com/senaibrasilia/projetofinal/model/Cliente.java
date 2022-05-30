package br.com.senaibrasilia.projetofinal.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Classe de mapeamento de tabela
 * Classe de Entidade */

// CREATE TABLE PRODUTO
@Entity
@Table(name = "Clientes")
public class Cliente {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private BigDecimal cpf;
	
	public Cliente() {
		
	}
	public Cliente(String nome, BigDecimal cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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


	public BigDecimal getcpf() {
		return cpf;
	}

	public void setcpf(BigDecimal cpf) {
		this.cpf = cpf;
	}

}
