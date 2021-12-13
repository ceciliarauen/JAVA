import javax.swing.JOptionPane;

public class SequenciaNumerica {

	public static void main(String[] args) {
		/*
		 * Ex 2 - Sequencia de Números:
		 * 
		 * 1. Pedir ao usuário informar um número inteiro cada vez; --ok 2. Quando o
		 * usuário informar 0 o programa deve parar, e o 0 deve ser desconsiderado da
		 * sequência; -- OK 3. No fim o programa deve informar: - Quantos numeros foram
		 * passados; -- OK - Qual o maior número passado; -- ok - Qual a média
		 * aritmética de todos os números passados.
		 * 
		 * Obs: A Média Aritmética de um conjunto de dados é obtida somando todos os
		 * valores e dividindo o valor encontrado pelo número de dados desse conjunto.
		 */

		int numero = 1, maiorNumero = 0, media = 0, totalNumeros = 0, somaNumeros = 0;

		while (numero != 0) {
			numero = Integer.parseInt(JOptionPane
					.showInputDialog("Informe um número inteiro: \n" + "\n Informe 0 para sair do programa"));
			if (numero == 0) {
				break;
			}
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			somaNumeros += numero;

			totalNumeros++;
			media = somaNumeros / totalNumeros;
		}

		System.out.println("Foram informados " + totalNumeros + " números.\n");
		System.out.println("O maior número informado foi, " + maiorNumero + ".\n");

		System.out.println("A média aritmética é, " + media + ".\n");

	}

}
