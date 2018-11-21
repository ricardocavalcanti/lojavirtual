package br.com.lojavirtual.models;

import java.math.BigDecimal;

public class Livro {

	private String descricao;
	
	private BigDecimal preco;
	
	private Integer numeroPaginas;
	
	private String titulo;
	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Livro [descricao=" + descricao + ", preco=" + preco + ", numeroPaginas=" + numeroPaginas + ", titulo="
				+ titulo + "]";
	}

	
	
}
