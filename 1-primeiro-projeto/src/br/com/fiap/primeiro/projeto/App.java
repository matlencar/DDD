package br.com.fiap.primeiro.projeto;

public class App {

	//M�todo que inicia a execu��o do programa
	public static void main(String[] args) {
		//System.out.print("Ol� Devs!");
		
		//Criar o objeto pessoa 
		
		Pessoa pessoa = new Pessoa();
		
		//Chamar os metodos
		pessoa.andar(6);
		String fala = pessoa.falar("Ganhei ??");
		System.out.println(fala);
	
	}
	
}
