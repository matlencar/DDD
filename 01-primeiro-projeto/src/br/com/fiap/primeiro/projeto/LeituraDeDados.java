package br.com.fiap.primeiro.projeto;

import java.util.Scanner;

public class LeituraDeDados {

	// Ler os dados do usuario

	public static void main(String[] args) {
		// Objeto que � capaz de ler as informa��es

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade:");
		// Lendo um numero inteiro
		int idade = sc.nextInt();

		System.out.println("Minha idade �: " + idade);

		System.out.println("Digite seu nome:");
		// Ler o nome
		String nome = sc.next();

		// Exibindo o nome inserido pelo usuario
		// System.out.println("Meu nome � " + nome);

		System.out.println("Digite qual seu salario:");
		// Ler salario
		double salario = sc.nextDouble();

		// Ler o salario exibido pelo usuario
		// System.out.println("Meu salario � de: " + salario);

		System.out.println("Meu nome � " + nome + " tenho " + idade + " idade e ganho " + salario);

		sc.close(); // fechar recursos
	}

}
