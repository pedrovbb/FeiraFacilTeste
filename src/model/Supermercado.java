package model;

import util.ID;

public class Supermercado {
	
	private String nome;
	private ID id;
	
	public Supermercado(ID id, String nome) {
		this.id = id;
		this.nome = nome;}

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
}
