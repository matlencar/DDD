package br.com.fiap.primeiro.projeto;

public class Pessoa {
<<<<<<< HEAD
	
	//Atributos
	//[tipo de dado] [nome do atributo];
	String nome;
	
	int idade;
	
	int posicao; // posição da pessoa no tabuleiro;
	
	//Metodos
	//[tipo do retorno] [nome do metodo] [(parametros)]
	// void -> não tem retorno
	void andar(int casas) {
		posicao += casas;
	}
	
	String falar(String pensamento) {
		String texto = pensamento + " estou na casa: " + posicao;
		return texto;
				
	}
	
	
=======

	public static void main(String[] args) {
		
		System.out.println("Hello World");

	}

>>>>>>> 8e155250e780cf3c83fd20655d0fd3ebb9783bdc
}
