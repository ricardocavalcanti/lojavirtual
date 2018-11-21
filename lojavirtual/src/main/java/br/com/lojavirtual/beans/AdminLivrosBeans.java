package br.com.lojavirtual.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.lojavirtual.models.Livro;

// CDI
@Named(value="adminLivrosBean")
@RequestScoped
public class AdminLivrosBeans {
	
	private Livro livro = new Livro();
	
	
	public void salvar() {
		
		System.out.println("Livro cadastrado: "+livro);		
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
