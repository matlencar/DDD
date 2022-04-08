package br.com.fiap.encapsulamento.view;

import br.com.fiap.encapsulamento.model.Pastel;

public class Teste {
	
	public static void main(String[] args) {
		
		//Instanciar um Pastel
		Pastel pastel = new Pastel();
		
		//Atribuindo valores para o objeto
		pastel.setSabor("Carne");
		pastel.setValor(10);
		pastel.setPronto(true);
		
		//Recuperar o valor
		System.out.println(pastel.getSabor());
		System.out.println(pastel.getValor());
		System.out.println(pastel.isPronto());
	}
}
