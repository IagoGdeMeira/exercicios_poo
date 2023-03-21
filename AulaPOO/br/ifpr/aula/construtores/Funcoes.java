public class Funcoes {
	
	double novoSalario(double salario, int percentualAumento) {
		return salario + salario * (percentualAumento * 0.01);
	}
	
	void imprimirTipos() {
		System.out.println("String, char, int, double, boolean, void");
	}
	
	int somaAteZero(int numeroMaximo) {
		int soma = 0;
		for(int i = 0; i <= numeroMaximo; i++)
			soma += i;
		return soma;
	}
	
	String nomeComIdade(String nome, int diaNasc, int mesNasc, int anoNasc) {
		int idade = 2023 - anoNasc;
		if(mesNasc > 3 || (mesNasc == 3 && diaNasc > 15))
            idade -= 1;
		return nome + ": " + idade + " anos de idade";
	}
	
	void disciplinas2AnoES() {
		System.out.println("- Banco de Dados");
		System.out.println("- Projeto Integrador I");
		System.out.println("- Análise e Projeto de Sistemas");
		System.out.println("- Programação Orientada a Objetos");
		System.out.println("- Cálculo I");
		System.out.println("- Algoritmos e Estruturas de Dados II");
		System.out.println("- Interação Humano-Computador");
		System.out.println("- Arquitetura de Computadores");
		System.out.println("- Empreendedorismo");
	}
	
	void adicionandoData(String nome, int diaNasc, int mesNasc, int anoNasc) {
		System.out.println(nomeComIdade(nome, diaNasc, mesNasc, anoNasc) + " em 15/03/2023");
	}
	
}