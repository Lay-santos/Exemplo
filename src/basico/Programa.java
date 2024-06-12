package basico;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int anoAtual = 2024;
		int anoNasc = 2003;
		
		String nome = "Samuel Santos";;
		String fone = "11-91234-7777";
	
		System.out.println("Iniciando o programa....");
		
		int resultado = calculaIdade(anoAtual, anoNasc);
		System.out.println(resultado);
		
		
	}
	
	static int calculaIdade(int anoAtual, int anoNasc) {
		int idade = anoAtual - anoNasc;
		
		return idade;
}
}