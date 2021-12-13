import javax.swing.JOptionPane;

public class Adivinha {

	public static void main(String[] args) {
		/*
		 * 1. Gerar um n�meroAlvo aleat�rio entre 0 e 200; --OK 
		 * 2. Pedir um n�mero inteiro ao usu�rio; --ok 
		 * 3. Informar se o numero informado for maior ou menor que o n�meroAlvo at� que acerte; -- OK
		 */

		int numeroAlvo = (int) (Math.random() * 200);

		int tentativa = 201;
		while  (tentativa != numeroAlvo) {
			
			tentativa = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero at� acertar: "));

			if (tentativa < numeroAlvo) {
				JOptionPane.showMessageDialog(null, ("O n�mero informado � menor que o n�mero alvo"));
			} else if (tentativa > numeroAlvo) {
				JOptionPane.showMessageDialog(null, ("O n�mero informado � maior que o n�mero alvo"));
			} else {
				JOptionPane.showMessageDialog(null, ("Parabains, o numero alvo era " + numeroAlvo));
			}

		}
		System.out.println("Programa encerrou normalmente, significa que voc� acertou, muito bem.");
	}

}