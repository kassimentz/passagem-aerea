package com.algaworks.service;

import com.algaworks.model.Voo;

public class PrecoPassagemGold implements CalculadoraPrecoPassagem {

	@Override
	public double calcular(Voo voo) {
		if(voo.getPreço() > 500)
			return calcularValorAcimaDoLimite(voo);
		return calcularValorAbaixoDoLimite(voo);
	}

	private double calcularValorAbaixoDoLimite(Voo voo) {
		return voo.getPreço() * 0.90;
	}

	private double calcularValorAcimaDoLimite(Voo voo) {
		return voo.getPreço() * 0.85;
	}

}
