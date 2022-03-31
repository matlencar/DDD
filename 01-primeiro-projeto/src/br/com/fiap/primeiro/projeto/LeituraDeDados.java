package br.com.fiap.primeiro.projeto;

import java.util.Scanner;

public class LeituraDeDados {

	// Ler os dados do usuario

	public static void main(String[] args) {
		// Objeto que é capaz de ler as informações

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade:");
		// Lendo um numero inteiro
		int idade = sc.nextInt();

		System.out.println("Minha idade é: " + idade);

		System.out.println("Digite seu nome:");
		// Ler o nome
		String nome = sc.next();

		// Exibindo o nome inserido pelo usuario
		// System.out.println("Meu nome é " + nome);

		System.out.println("Digite qual seu salario:");
		// Ler salario
		double salario = sc.nextDouble();

		// Ler o salario exibido pelo usuario
		// System.out.println("Meu salario é de: " + salario);

		System.out.println("Meu nome é " + nome + " tenho " + idade + " idade e ganho " + salario);

		sc.close(); // fechar recursos
	}

}
