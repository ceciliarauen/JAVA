import javax.swing.JOptionPane;

public class SequenciaNumerica {

	public static void main(String[] args) {
		/*
		 * Ex 2 - Sequencia de N�meros:
		 * 
		 * 1. Pedir ao usu�rio informar um n�mero inteiro cada vez; --ok 2. Quando o
		 * usu�rio informar 0 o programa deve parar, e o 0 deve ser desconsiderado da
		 * sequ�ncia; -- OK 3. No fim o programa deve informar: - Quantos numeros foram
		 * passados; -- OK - Qual o maior n�mero passado; -- ok - Qual a m�dia
		 * aritm�tica de todos os n�meros passados.
		 * 
		 * Obs: A M�dia Aritm�tica de um conjunto de dados � obtida somando todos os
		 * valores e dividindo o valor encontrado pelo n�mero de dados desse conjunto.
		 */

		int numero = 1, maiorNumero = 0, media = 0, totalNumeros = 0, somaNumeros = 0;

		while (numero != 0) {
			numero = Integer.parseInt(JOptionPane
					.showInputDialog("Informe um n�mero inteiro: \n" + "\n Informe 0 para sair do programa"));
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

		System.out.println("Foram informados " + totalNumeros + " n�meros.\n");
		System.out.println("O maior n�mero informado foi, " + maiorNumero + ".\n");

		System.out.println("A m�dia aritm�tica �, " + media + ".\n");

	}

}
