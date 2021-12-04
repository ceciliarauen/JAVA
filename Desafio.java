import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		/*
		 * A Escola Futuro precisa controlar as notas e m�dias dos seus alunos. Para
		 * isso precisa de um programa que fa�a o seguinte: 1 - Informar a quantidade de
		 * alunos 2 - Informar a quantidade de notas 3 - Informar nota a nota 4 -
		 * Calcular a m�dia 5 - Para cada aluno verificar a situa��o Se m�dia < 6 -
		 * Reprovado Se m�dia >= 6 e < 7.5 - Em Recupera��o Se m�dia >= 7.5 - Aprovado 6
		 * - Para cada aluno imprimir o Nome, M�dia e Situa��o 7 - No final do programa
		 * imprimir a melhor m�dia e a m�dia da turma
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		int qtdAlunos, qtdNotas, contaNota, contaAlunos;
		double valorNota, valorMedia, maiorMedia = 0, mediaTurma = 0;
		String nomeAluno, sitAluno;

		// Quantos alunos h� na escola?

		qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos:"));

		// Quantas notas ser�o calculadas?

		qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas:"));

		// La�o de repeti��o
		contaAlunos = 1;

		while (contaAlunos <= qtdAlunos) {
			nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno:");
			contaNota = 1;
			valorMedia = 0;

			contaAlunos++;

			while (contaNota <= qtdNotas) {
				valorNota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + contaNota + "� nota"));
				valorMedia += (valorNota / qtdNotas);
				contaNota++;

			}
			if (valorMedia > maiorMedia) {
				maiorMedia = valorMedia;
			}

			if (valorMedia < 6) {
				sitAluno = "Reprovado";
			} else if (valorMedia >= 6 && valorMedia <= 7.5) {
				sitAluno = "Em recupera��o";
			} else {
				sitAluno = "Aprovado";
			}
			System.out.println("Aluno....:" + nomeAluno);
			System.out.println("Aluno....:" + valorMedia);
			System.out.println("Aluno....:" + sitAluno + "\n");
			System.out.println("-----------------------------\n");
			mediaTurma += valorMedia / qtdAlunos;
		}
		System.out.println("A m�dia da turma � " + mediaTurma);
		System.out.println("A maior m�dia � " + maiorMedia);
	}
}
