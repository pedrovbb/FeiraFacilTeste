package model;

import util.CategoriaDeProduto;
import util.ID;

public class Produto {

	private String nome;
	private double preco;
	private CategoriaDeProduto tipo;
	private ID id;
	
	public Produto(ID id, String nome, double preco, CategoriaDeProduto tipo) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}	

	public CategoriaDeProduto getTipo() {
		return tipo;
	}
	
	public void setTipo(CategoriaDeProduto tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preço=" + preco + ", tipo=" + tipo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object produto) {
		if (this == produto)
			return true;
		if (produto == null)
			return false;
		if (getClass() != produto.getClass())
			return false;
		
		Produto produtoRecebido = (Produto) produto;
		// TODO talvez esteja exagerado, bastando ser por id, visto que é único
		return (this.id.equals(produtoRecebido.getId()) && this.toString().equals(produtoRecebido.toString()));
	}
}