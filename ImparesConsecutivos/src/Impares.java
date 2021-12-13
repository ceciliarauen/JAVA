import javax.swing.JOptionPane;

public class Impares {

	public static void main(String[] args) {
		/*
		 * 1. Pe�a um valor numN, que � a quantidade de casos teste que vem a seguir; -
		 * Sendo que (numN > 0); 2. Cada teste consiste em dois n�meros inteiros numX e
		 * numY; - Sendo que (numY > 0); 3. O programa deve printar uma sequencias dos
		 * numY n�meros �mpares consecutivos a partir de numX (incluindo o pr�prio numX
		 * se ele for impar); 3. Tamb�m deve printar a soma dessa sequ�ncia de n�meros;
		 * 4. No final deve se printar qual foi a maior soma e a menor soma dos n�meros
		 * entre os casos que houveram; 5. Printar a m�dia entre a maiorSoma e a
		 * menorSoma (com duas casas decimais);
		 */

		int qtdSequencias = 0, numX, numY, soma = 0, maiorSoma = 0, menorSoma = 0, media = 0;

		while (qtdSequencias <= 0)
			qtdSequencias = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero maior que 0"));

		for (int i = 0; i < qtdSequencias; i++) {
			soma = 0;
			numX = Integer.parseInt(JOptionPane.showInputDialog("Informe a partir de qual numero inicia: "));
			do {
				numY = Integer.parseInt(JOptionPane
						.showInputDialog("Informe quantos numeros a sequencia ter�\n" + "\n N�o pode ser 0"));
			} while (numY < 0);

			for (int contador = 0; contador < numY; numX++) {
				if (numX % 2 == 1 || numX % 2 == -1) {
					System.out.print(numX + " ");
					contador++;
					soma += numX;
				}

				if (maiorSoma < soma) {
					maiorSoma = soma;
				}
				if (menorSoma > soma) {
					menorSoma = soma;
				}
				media = (maiorSoma + menorSoma) / 2;
				
			}
			System.out.println();
			System.out.println("A soma da sequencia � " + soma + "\n");
			System.out.println("....................................");
		}
		System.out.println();
		
		System.out.println("A maior soma foi, " + maiorSoma);
		System.out.println("A menor soma foi, " + menorSoma);
		System.out.println("A m�dia entre a menor e maior soma �,  " + media);

	}

}