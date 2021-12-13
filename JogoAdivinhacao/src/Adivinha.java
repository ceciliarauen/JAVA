import javax.swing.JOptionPane;

public class Adivinha {

	public static void main(String[] args) {
		/*
		 * 1. Gerar um númeroAlvo aleatório entre 0 e 200; --OK 
		 * 2. Pedir um número inteiro ao usuário; --ok 
		 * 3. Informar se o numero informado for maior ou menor que o númeroAlvo até que acerte; -- OK
		 */

		int numeroAlvo = (int) (Math.random() * 200);

		int tentativa = 201;
		while  (tentativa != numeroAlvo) {
			
			tentativa = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero até acertar: "));

			if (tentativa < numeroAlvo) {
				JOptionPane.showMessageDialog(null, ("O número informado é menor que o número alvo"));
			} else if (tentativa > numeroAlvo) {
				JOptionPane.showMessageDialog(null, ("O número informado é maior que o número alvo"));
			} else {
				JOptionPane.showMessageDialog(null, ("Parabains, o numero alvo era " + numeroAlvo));
			}

		}
		System.out.println("Programa encerrou normalmente, significa que você acertou, muito bem.");
	}

}