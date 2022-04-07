package br.com.fiap.exercicio.bank;

public class Endereco {
	
	//Variaveis
	String rua;
	short numero;
	String complemento;
	String bairro;
	String cep;
	
	//Metodos
	void setNumero(short novoNumero) {
		numero = novoNumero; //<------- Atribuição
	}
	
	short getNumero() {
		return numero; //<----- retorno do metodo quando não é void
	}

}
