package Funcionario;

public class FolhaDePagamento {
	
	private double pagamentoTotal = 0;
	
	public void registrar(Funcionario funcionario) {
		pagamentoTotal = pagamentoTotal + funcionario.calcularSalario();
	}
	
	public void login(Autenticavel funcionario){
		if(funcionario.autenticar("123")) 
			System.out.println("logado com sucesso");
		else	
		System.out.println("Falha de login");
	}
		
	public double getPagamentoTotal() {
		return pagamentoTotal;
	}
}