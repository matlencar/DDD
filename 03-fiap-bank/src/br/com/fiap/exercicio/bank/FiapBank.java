package br.com.fiap.exercicio.bank;

import java.util.Scanner;

public class FiapBank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Instanciar o Cliente
		Cliente cliente = new Cliente();
		
		//Instanciar o endereço
		Endereco endereco = new Endereco();
		
		//Instanciar Conta Corrente
		ContaCorrente conta = new ContaCorrente();
		
		//Atribuir valores para o cliente
		cliente.nome = "Joaozinho";
		cliente.cpf = "123.456.789-10";
		cliente.endereco = endereco; //<------Atribuindo um objeto a um atributo
		
		//Atribuir valores para o endereço
		endereco.bairro = "Avenida Lins de Vasconcelos";
		endereco.bairro = "Aclimação";
		endereco.cep = "12354-540";
		endereco.numero = 1222;
		
		//Atribuir valores para a conta corrente
		conta.saldo = 1500.00;
		conta.titular = cliente; //<------Atribuindo um objeto a um atributo
		
		
		
		

	}

}
