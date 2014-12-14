package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<ListaDeProdutos> carrinho;
	// não precisa de ID pois só haverá 1 carrinho
	
	public Carrinho(){
		carrinho = new ArrayList<ListaDeProdutos>();
	}

	public void adicionaFeira(ListaDeProdutos lista){
		this.carrinho.add(lista);
	}
	
	public void removeFeira(ListaDeProdutos lista){
		this.carrinho.remove(lista);
	}
	
	// TODO talvez precise melhorar
	public boolean TemAFeira(String nome){
		for(ListaDeProdutos lista : carrinho){
			if(lista.getNome().equals(nome)){
				return true; 
			}
		}
		return false;
	}
	 
}
