package br.com.lojavirtual.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
	@Inject
	private FacesContext context;	
		

	@Transactional
	public String salvar() {		
	
		
	    dao.salvar(livro);		
		
		context.getExternalContext().getFlash().setKeepMessages(true);			
		context.addMessage(null, new FacesMessage("Livro casdastrado com sucesso!"));
		
		
		return "/livros/lista?faces-redirect=true";
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
	
	
	
}
