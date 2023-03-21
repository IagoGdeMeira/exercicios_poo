public class Main {
    public static void main(String[] args) {
    Funcoes aumentoSalario = new Funcoes();
		double meuSalario = aumentoSalario.novoSalario(2000, 20);
		// System.out.println(meuSalario);
		
		Funcoes imprimindoTipos = new Funcoes();
		// imprimindoTipos.imprimirTipos();
		
		Funcoes somatoria = new Funcoes();
		int resultadoSoma = somatoria.somaAteZero(5);
		// System.out.println(resultadoSoma);
		
		Funcoes calcIdade = new Funcoes();
		String nomeIdade = calcIdade.nomeComIdade("Iago", 13, 10, 2003);
		// System.out.println(nomeIdade);
		
		Funcoes chamadaDisciplinas = new Funcoes();
		// chamadaDisciplinas.disciplinas2AnoES();
		
		Funcoes melhorandoCalcIdade = new Funcoes();
		melhorandoCalcIdade.adicionandoData("Iago", 13, 10, 2003);
    }
}