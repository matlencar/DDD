package br.com.fiap.exercicio.classes;

public class Pessoa {

	// Scanner sc = new Scanner(System.in);

	// Atributos
	String nome;
	int idade;
	float altura;

	// Metodos
	void alterarNome(String novoNome) {
		nome = novoNome;

	}

	void alterarIdade(int novaIdade) {
		idade = novaIdade;

	}

	void alterarAltura(float novaAltura) {
		altura = novaAltura;

	}

	String recuperarNome() {
		return nome;
	}

	int recuperarIdade() {
		return idade;
	}

	float recuperarAltura() {
		return altura;
	}

}
