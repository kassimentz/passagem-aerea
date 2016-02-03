package com.algaworks.model;

public class Voo {

	private String origem;
	private String destino;
	private double preço;

	public Voo(String origem, String destino, double preço) {
		this.origem = origem;
		this.destino = destino;
		this.preço = preço;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

}
