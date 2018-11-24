package br.com.lojavirtual.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.lojavirtual.models.Livro;

public class LivroDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar (Livro livro) {	
		manager.persist(livro);	
		
	}
	

}
