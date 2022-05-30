package br.com.senaibrasilia.projetofinal.dao;

import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.model.Categoria;

public class CategoriaDAO {

	private EntityManager em;

	public CategoriaDAO() {

	}

	public CategoriaDAO(EntityManager em) {
		this.em = em;
	}

	// Cadastrar categoria (PERSIST)
	public void cadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}

	// Atualizar informa��es do primeiro Cadastro (MERGE)
	public void atualizar(Categoria categoria) {
		this.em.merge(categoria);
	}

	public void remover(Categoria categoria) {
		categoria = em.merge(categoria);
		this.em.remove(categoria);

	}

}
