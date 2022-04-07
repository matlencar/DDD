package br.com.fiap.primeiro.projeto;

public class App {

	//Método que inicia a execução do programa
	public static void main(String[] args) {
		//System.out.print("Olá Devs!");
		
		//Criar o objeto pessoa 
		
		Pessoa pessoa = new Pessoa();
		
		//Chamar os metodos
		pessoa.andar(6);
		String fala = pessoa.falar("Ganhei ??");
		System.out.println(fala);
	
	}
	
}
