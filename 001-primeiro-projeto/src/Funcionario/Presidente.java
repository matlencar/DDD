package Funcionario; 

public final class Presidente extends Funcionario implements Autenticavel {
	
	private double valorDaCotaDeAcoes;
	
	private String senha = "123";
	
	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + this.valorDaCotaDeAcoes;
	}

	public double getValorDaCotaDeAcoes() {
		return valorDaCotaDeAcoes;
	}

	public void setValorDaCotaDeAcoes(double valorDaCotaDeAcoes) {
		this.valorDaCotaDeAcoes = valorDaCotaDeAcoes;
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}
	
	
}
