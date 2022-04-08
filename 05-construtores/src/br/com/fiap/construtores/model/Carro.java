package br.com.fiap.construtores.model;

public class Carro {

	// Atributos
	private String modelo;
	private int ano;
	private boolean blindado;
	private float motor;
	private boolean pagaIpva;

	// Construtor, chamado com o operador new
	// 1 - não tem retorno(nem void)
	// 2 - Possui o mesmo nome da Classe
	public Carro(String modelo) {
		this.modelo = modelo;
		if (2022 - ano > 20) {
			pagaIpva = false;
		} else {
			pagaIpva = true;
		}
	}

	// Criar um construto com todos os atributos
	public Carro(String modelo, int ano, boolean blindado, float motor) {
		this(modelo); // Chama o construtor que recebe o modelo
		this.ano = ano;
		this.blindado = blindado;
		this.motor = motor;
	}

	// Getters and Setters / Encapsulamento

	// Setters <------ começo
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setBlindado(boolean blindado) {
		this.blindado = blindado;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}
	// Setters <------ fim

	// Getters <------ começo
	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public boolean getBlindado() {
		return blindado;
	}

	public float getMotor() {
		return motor;
	}
	// Getters <------ fim
}
