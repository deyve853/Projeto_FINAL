package br.com.senaibrasilia.projetofinal.dao;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class ClienteDAO {

	@Entity
	@Table(name = "Clientes")
	public class Cliente {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		private Double id;
		private String nome;
		private BigDecimal cpf;
		
		public void removeEntity() {
			
		}

		public Double getId() {
			return id;
		}

		public void setId(Double id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public BigDecimal getCpf() {
			return cpf;
		}

		public void setCpf(BigDecimal cpf) {
			this.cpf = cpf;
		}

	}
}
