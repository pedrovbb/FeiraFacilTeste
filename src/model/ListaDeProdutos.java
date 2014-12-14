package model;

import java.util.*;

public class ListaDeProdutos{

	private List<Produto> listaDeProdutos;
	// TODO lembrar de recalcular esse valor (o preço) quando houver att dos
	// produtos, soh eh bom armazenar para saber se a feira esta ou nao mais barata
	private double precoTotal;
	private String nome;
	
	public ListaDeProdutos(String nome){
		this.nome = nome;
		listaDeProdutos = new ArrayList<Produto>();
		precoTotal = 0;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void adicionaProduto(Produto produto){
		setPrecoTotal(this.precoTotal + produto.getPreco());
		listaDeProdutos.add(produto);
	}
	
	public void removeProduto(Produto produto){
		setPrecoTotal(this.precoTotal - produto.getPreco());
		listaDeProdutos.remove(produto);
	}
	
	public boolean produtoEstaNaLista(Produto produto){
		return listaDeProdutos.contains(produto);
	}	
	
	// TODO quando o produto eh adicionado ja modifica a variavel, entao nao precisa incrementar de novo
	public double getPrecoTotal(){
		return precoTotal;
	}
	
	private void setPrecoTotal(double preco){
		this.precoTotal = preco;
	}
	
	@Override
	public String toString() {
		return "ListaDeProdutos [listaDeProdutos=" + listaDeProdutos + ", preco=" + precoTotal + "]";
	}
	
	@Override
	/**
	 * Duas listas são iguais apenas se tiverem exatamente os mesmos produtos e quantidades
	 */
	public boolean equals(Object lista) {
		if (this == lista)	return true;
		if (lista == null)	return false;
		if (!(lista instanceof ListaDeProdutos)) return false;
		
		// para conservar as duas listas
		@SuppressWarnings("unchecked")
		List<Produto> listaDeProdutosRecebida = ((List<Produto>) lista);
		List<Produto> listaDeProdutosAtual = this.listaDeProdutos;
		
		if(listaDeProdutosAtual.size() != listaDeProdutosRecebida.size()){
			return false;
		}
		
		for (Produto produto : listaDeProdutosRecebida) {
			if (listaDeProdutosAtual.contains(produto)) {
				listaDeProdutosAtual.remove(produto);
				listaDeProdutosRecebida.remove(produto);
			} else {
				return false;
			}
		}
		
		return listaDeProdutosAtual.size() != listaDeProdutosRecebida.size();
	}
	
	// TODO implementar método contemLista, a lógica será quase a mesma do equals acima
}
