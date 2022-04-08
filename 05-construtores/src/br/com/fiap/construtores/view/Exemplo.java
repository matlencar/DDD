package br.com.fiap.construtores.view;

import java.util.Scanner;
import br.com.fiap.construtores.model.Carro;

public class Exemplo {

	public static void main(String[] args) {

		// Instanciando um leitor
		Scanner leitor = new Scanner(System.in);

		// Instanciar um carro
		//Construtor cria o objeto com as informações iniciaias
		Carro carro = new Carro("Corsa");
		//Depois podemos alterar as informações com os metodos set
		carro.setModelo("Corsel  I ");

		Carro gol = new Carro("Gol", 2001, false, 1.0f);
		gol.setAno(2010);
	}

}
