
public class TestaVariaveis {

	public static void main(String[] args) {
		System.out.println("Ol� novo teste");
		String nome;
		int idade;
		double salario;
		
		nome = "joao";
		idade = 10;
		salario = 1250.70;
		
		System.out.println("Ol� meu nome � " + nome + ", eu tenho " + idade + " anos de idade e recebo R$" + salario + " por m�s.");
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		//adicionando o .0 a um dos numeros o sistema adiciona numero ap�s a virgula.
		double novaTentativa = 5/2.0;
		
		System.out.println(novaTentativa);
	}

}
