package br.com.fiap.exercicio.classes;

import java.util.Scanner;

public class Exercicio {
	
	//metodo main
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//instanciar o elevador
		
		Elevador elevador = new Elevador();
		
		//Inicializar o total de andares e a capacidade
		elevador.inicializa(18, 6);
		
		//subir um andar
		elevador.sobe();
		
		//adicionar uma pessoa
		elevador.entra();
		
		//exibir o andar atual e a quantidade de pessoas no elevador
		System.out.println("Andar atual:" + elevador.andarAtual);
		System.out.println("Quantidade de pessoas:" + elevador.quantidadePessoaAtual);
		
		//Exibir o total de andares e a capacidade
		System.out.println("Quantidade de andares é de: " + elevador.totalAndares + " e a sua capacidade é de: " + elevador.capacidade);
	}
}