import javax.swing.JOptionPane;

public class TesteJOP {
	public static void main(String[] args) {
		/*
		 * String nome = JOptionPane.showInputDialog("Qual seu nome?");
		 * 
		 * System.out.println(nome);
		 */

		// JOP confirmação, YES, NO E CANCEL

		/*
		 * String nome = null; 
		 * nome = JOptionPane.showInputDialog("Qual seu nome?");
		 * JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
		 */

	
		
		String nome = null;
		int resposta;
		nome = JOptionPane.showInputDialog("Informe seu nome:");
		resposta = JOptionPane.showConfirmDialog(null, "Seu nome é " + nome + "?");
		if (resposta == JOptionPane.YES_OPTION) {
			System.out.println("Seu nome é " + nome);
		}else if (resposta == JOptionPane.NO_OPTION) {
			System.out.println("Seu nome não é " + nome);
		}
		
	}
}
