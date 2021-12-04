
public class TestaVariaveis {

	public static void main(String[] args) {
		System.out.println("Olá novo teste");
		String nome;
		int idade;
		double salario;
		
		nome = "joao";
		idade = 10;
		salario = 1250.70;
		
		System.out.println("Olá meu nome é " + nome + ", eu tenho " + idade + " anos de idade e recebo R$" + salario + " por mês.");
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		//adicionando o .0 a um dos numeros o sistema adiciona numero após a virgula.
		double novaTentativa = 5/2.0;
		
		System.out.println(novaTentativa);
	}

}
