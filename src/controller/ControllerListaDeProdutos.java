package controller;

import java.util.List;

import util.ID;
import model.ListaDeProdutos;
import model.Produto;

public class ControllerListaDeProdutos {

	private ListaDeProdutos listaAtual;
	
	public ControllerListaDeProdutos(ListaDeProdutos lista){
		this.listaAtual = lista;
	}
	
	public ControllerListaDeProdutos(){
		listaAtual = new ListaDeProdutos("Lista atual");
	}
	
//	TODO sera usado futuramente quando for implementado o repositorio
//	public void salvarLista() {
//		// caso tenha uma lista com mesmo nome a sobrescreve 
//		if (repositorioDeListas.contemListaPorNome(listaAtual.getNome())) {
//			repositorioDeListas.removeLista(listaAtual);
//		}
//		repositorioDeListas.add(listaAtual);
//	}
//	
//	public void removeLista(String nomeDaLista) {
//		repositorioDeListas.remove(pesquisarLista(nomeDaLista));
//	}
//	
//	public void removeLista(ListaDeProdutos lista){
//		repositorioDeListas.remove(lista);
//	}

	public List<Produto> pesquisarProdutoPorNome(String nome){
		/* TODO falta implementar.*/
		return null;
	}

	public List<Produto> pesquisarProdutoPorID(ID id){
		/* TODO falta implementar.*/
		return null;
	}	
	
	public void atualizarProduto(Produto produto) {
		// TODO falta implementar. 
	}
	
	public void adicionaProduto(Produto produto){
		listaAtual.adicionaProduto(produto);
	}
	
	public void removerProduto(Produto produto) {
		listaAtual.removeProduto(produto);
	}
	
}