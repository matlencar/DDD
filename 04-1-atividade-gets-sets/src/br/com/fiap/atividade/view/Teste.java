package br.com.fiap.atividade.view;

import java.util.Scanner;

import br.com.fiap.atividade.model.Aviao;
import br.com.fiap.atividade.model.Carro;
import br.com.fiap.atividade.model.Cor;
import br.com.fiap.atividade.model.Lancha;

public class Teste {

	public static void main(String[] args) {

		// Instanciar o Scanner(objeto para ler o teclado)
		Scanner leitor = new Scanner(System.in);
		
		//Instanciar a Cor
		Cor cor = new Cor();

		// Instanciar o Carro
		Carro carro = new Carro();

		// Instanciar o Avi�o
		Aviao aviao = new Aviao();

		// Instanciar a Lancha
		Lancha lancha = new Lancha();
		
		// Atribuir valores para o carro
		System.out.println("Qual o modelo do carro ? : ");
		carro.setModelo(leitor.nextLine());
		System.out.println("Quantos lugares o carro possui ? : ");
		carro.setQuantidadeLugares(leitor.nextInt());
		//System.out.println("Qual o ano de fabrica��o ? : ");
		//carro.anoFabricacao = leitor.nextInt();
		//System.out.println("Qual � o comprimento do carro ? : ");
		//carro.comprimento = leitor.nextDouble();
		//System.out.println("Quantas portas ele possui ? : ");
		//carro.quantidadePortas = leitor.nextInt();
		//carro.cor = cor;
		//System.out.println("Qual no numero da placa ? : ");
		//carro.placa = leitor.nextLine();
		//System.out.println("Que tipo de motor � ? : ");
		//carro.motor = leitor.nextFloat();
		
		// Atribuir valores para o avi�o
		//System.out.println("Qual o modelo do avi�o ? : ");
		//aviao.modelo = leitor.nextLine();
		//System.out.println("Quantos lugares o avi�o possui ? : ");
		//aviao.quantidadeLugares = leitor.nextInt();
		//System.out.println("Qual o ano de fabrica��o ? : ");
		//aviao.anoFabricacao = leitor.nextInt();
		//System.out.println("Qual � o comprimento do avi�o ? : ");
		//aviao.comprimento = leitor.nextDouble();
		//System.out.println("Quantas turbinas ele possui ? : ");
		//aviao.quantidadeTurbinas = leitor.nextInt();
		//carro.cor = cor;
		
	}

}
