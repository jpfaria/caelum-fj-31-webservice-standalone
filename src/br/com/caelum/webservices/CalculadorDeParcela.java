package br.com.caelum.webservices;

import javax.jws.WebService;

@WebService
public class CalculadorDeParcela {

	public double calculaParcela(double valorTotal, int quantidade) {

		if (quantidade < 0) {
			return 0;
		}

		double oValorTotal = valorTotal * (1 + (quantidade / 100.0));
		
		double parcela = oValorTotal / quantidade;
		
		System.out.println(parcela);
		
		return parcela;
	}

}