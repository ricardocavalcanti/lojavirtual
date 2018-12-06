package br.com.lojavirtual.beans;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

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
	
	@Transactional
	public void salvar() {
		
		dao.salvar(livro);
		System.out.println("Livro cadastrado: "+livro);		
	}

	public List<Autor> getAutores(){
		return Arrays.asList(new Autor(1, "Paulo Silveira"), new Autor(2, "Sérgio Lopes"));
		
	}

	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
