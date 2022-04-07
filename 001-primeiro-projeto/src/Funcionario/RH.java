package Funcionario; 

public class RH {
	public static void main(String[] args) {
		Engenheiro engenheiro = new Engenheiro();
	    engenheiro.setSalarioBase(5000);
	    System.out.println(engenheiro.calcularSalario());
	    
	    Gerente gerente = new Gerente();
	    gerente.setSalarioBase(3000);
	    gerente.setBonus(500);
	    System.out.println(gerente.calcularSalario());
	    
	    Presidente presidente = new Presidente();
	    presidente.setSalarioBase(10000);
	    presidente.setValorDaCotaDeAcoes(3000);
	    System.out.println(presidente.calcularSalario());
	}
}
