package br.com.fiap.encapsulamento.model;

public class Pastel {

	// Atributo
	private String sabor;
	private double valor;
	private boolean pronto;

	// Encapsulamento Getters and Setters (metodos para ler e escrever os valores dos atributos)

	// Metodos de leitura
	public String getSabor() {
		return sabor; // retorna o valor do atributo sabor
	}

	// Metodo de escrita
	public void setSabor(String sabor) {
		this.sabor = sabor; // <----- atribui o valor do parametro do metodo no atributo da classe
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//Para boolean pode ser --> get ou is
	public boolean isPronto() {
		return pronto;
	}

	public void setPronto(boolean pronto) {
		this.pronto = pronto;
	}

}
