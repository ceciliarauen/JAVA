import javax.swing.JOptionPane;

public class ConjuntoInteiros {

	public static void main(String[] args) {
		/*
		 * Ex 3 - Conjunto de Inteiros:
		 * 
		 * 1. Receba um n�mero T; - Sendo que (T >= 0) 2. Fa�a um programa que pe�a T
		 * vezes dois valores - que ser�o valores para A e B; - Sendo que (B > 0);
		 * 3.Imprima o seguinte: - Imprima uma sequ�ncia dos 4 n�meros a partir de 3
		 * (incluindo o 3); - Imprima o valor da soma dessa sequ�ncia;
		 */
		int tentativas, num1, num2, soma;

		tentativas = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro: "));
		while (tentativas < 0) {
			tentativas = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro maior que 0: "));
		}
		for (int i = 1; i <= tentativas; i++) {
			
			soma = 0;
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos numeros a sequencia ter�: "));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("A partir de qual n�mero inicia: "));
			while (num1 < 0) {
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero maior que 0 >:( "));
			}
			for (int contador = 1; contador <= num1; contador++, num2++) {
				
				System.out.print(num2 + " ");

				
				soma += num2;
			}
			System.out.println();
			System.out.println(soma);
			System.out.println(".........");
		}
	}

}
