package br.com.fiap.classe.exercicio;

public class Elevador {

	// Atributos

	int andarAtual;
	int totalAndares;
	int capacidade;
	int quantidadeTotalPessoas;

	// Metodos
	void inicializar(int andares, int capacidade) {
		totalAndares = andares;
		this.capacidade = capacidade;
	}

	void subir() {
		andarAtual++;
	}

	void desce() {
		andarAtual--;
	}

	void entra() {
		quantidadeTotalPessoas++;
	}

	void sai() {
		quantidadeTotalPessoas--;
	}

}
