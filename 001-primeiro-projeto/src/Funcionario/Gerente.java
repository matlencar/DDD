package Funcionario; 

public class Gerente extends Funcionario implements Autenticavel {
	
	private String area;
	private double bonus;
	private String senha = "321";
	
	@Override
	public double calcularSalario() {
		return this.getSalarioBase()+ this.bonus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	} 
	
	
}
