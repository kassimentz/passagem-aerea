package com.algaworks.service;

import com.algaworks.model.Voo;

public class PrecoPassagemSilver implements CalculadoraPrecoPassagem{

	@Override
	public double calcular(Voo voo) {
		if(voo.getPreço() > 700.0)
			return calcularValorAcimaLimite(voo);
		return calcularValorAbaixoLimite(voo);
	}

	private double calcularValorAbaixoLimite(Voo voo) {
		return voo.getPreço() * 0.94;
	}

	private double calcularValorAcimaLimite(Voo voo) {
		return voo.getPreço() * 0.90;
	}

}
