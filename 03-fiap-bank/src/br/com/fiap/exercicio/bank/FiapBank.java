package br.com.fiap.exercicio.bank;

import java.util.Scanner;

public class FiapBank {

	public static void main(String[] args) {

		// Instanciar o Scanner(objeto para ler o teclado)
		Scanner leitor = new Scanner(System.in);

		// Instanciar o Cliente
		Cliente cliente = new Cliente();

		// Instanciar o endereço
		Endereco endereco = new Endereco();

		// Instanciar Conta Corrente
		ContaCorrente conta = new ContaCorrente();

		// Atribuir valores para o cliente
		System.out.println("Digite o nome:");
		cliente.nome = leitor.nextLine();
		System.out.println("Digite o cpf:");
		cliente.cpf = leitor.nextLine();
		cliente.endereco = endereco; // <------Atribuindo um objeto a um atributo

		// Atribuir valores para o endereço
		System.out.println("Digite o nome da rua:");
		endereco.rua = leitor.nextLine(); //<--------Ex: Utilizando o objeto + scanner para a leitura das informações
		System.out.println("Digite o nome do bairro:");
		endereco.bairro = leitor.nextLine();
		System.out.println("Digite o CEP:");
		endereco.cep = leitor.nextLine();
		System.out.println("Digite o numero da residencia:");
		endereco.numero = leitor.nextShort();

		// Atribuir valores para a conta corrente
		System.out.println("Digiteo valor do seu saldo:");
		conta.saldo = leitor.nextDouble();
		conta.titular = cliente; // <------Atribuindo um objeto a um atributo

		// Fechar leitor
		leitor.close();

	}

}
