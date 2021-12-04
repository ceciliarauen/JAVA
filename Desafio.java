import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		/*
		 * A Escola Futuro precisa controlar as notas e médias dos seus alunos. Para
		 * isso precisa de um programa que faça o seguinte: 1 - Informar a quantidade de
		 * alunos 2 - Informar a quantidade de notas 3 - Informar nota a nota 4 -
		 * Calcular a média 5 - Para cada aluno verificar a situação Se média < 6 -
		 * Reprovado Se média >= 6 e < 7.5 - Em Recuperação Se média >= 7.5 - Aprovado 6
		 * - Para cada aluno imprimir o Nome, Média e Situação 7 - No final do programa
		 * imprimir a melhor média e a média da turma
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		int qtdAlunos, qtdNotas, contaNota, contaAlunos;
		double valorNota, valorMedia, maiorMedia = 0, mediaTurma = 0;
		String nomeAluno, sitAluno;

		// Quantos alunos há na escola?

		qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos:"));

		// Quantas notas serão calculadas?

		qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas:"));

		// Laço de repetição
		contaAlunos = 1;

		while (contaAlunos <= qtdAlunos) {
			nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno:");
			contaNota = 1;
			valorMedia = 0;

			contaAlunos++;

			while (contaNota <= qtdNotas) {
				valorNota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + contaNota + "° nota"));
				valorMedia += (valorNota / qtdNotas);
				contaNota++;

			}
			if (valorMedia > maiorMedia) {
				maiorMedia = valorMedia;
			}

			if (valorMedia < 6) {
				sitAluno = "Reprovado";
			} else if (valorMedia >= 6 && valorMedia <= 7.5) {
				sitAluno = "Em recuperação";
			} else {
				sitAluno = "Aprovado";
			}
			System.out.println("Aluno....:" + nomeAluno);
			System.out.println("Aluno....:" + valorMedia);
			System.out.println("Aluno....:" + sitAluno + "\n");
			System.out.println("-----------------------------\n");
			mediaTurma += valorMedia / qtdAlunos;
		}
		System.out.println("A média da turma é " + mediaTurma);
		System.out.println("A maior média é " + maiorMedia);
	}
}
