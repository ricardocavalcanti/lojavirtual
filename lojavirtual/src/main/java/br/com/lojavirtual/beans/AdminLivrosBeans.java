package br.com.lojavirtual.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.lojavirtual.daos.AutorDao;
import br.com.lojavirtual.daos.LivroDao;
import br.com.lojavirtual.models.Autor;
import br.com.lojavirtual.models.Livro;

// CDI
@Named(value="adminLivrosBean")
@RequestScoped
public class AdminLivrosBeans {
	
	private Livro livro = new Livro();
	
	//Context and dependency injection
	@Inject
	private LivroDao dao;
	@Inject
	private AutorDao autorDao;
	
	private List<Integer> autoresId = new ArrayList<>();

		
	

	@Transactional
	public void salvar() {
		
		for (Integer autorId : autoresId) {
			
			livro.getAutores().add(new Autor(autorId));
			
		}
		dao.salvar(livro);
		System.out.println("Livro cadastrado: "+livro);	
		
		this.livro = new Livro();
		this.autoresId = new ArrayList<>();
	}

	public List<Autor> getAutores(){
		return autorDao.listar();
		
	}

	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	public List<Integer> getAutoresId() {
		return autoresId;
	}

	public void setAutoresId(List<Integer> autoresId) {
		this.autoresId = autoresId;
	}

}
