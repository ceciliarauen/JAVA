import javax.swing.JOptionPane;

public class TesteJOP {
	public static void main(String[] args) {
		/*
		 * String nome = JOptionPane.showInputDialog("Qual seu nome?");
		 * 
		 * System.out.println(nome);
		 */

		// JOP confirma��o, YES, NO E CANCEL

		/*
		 * String nome = null; 
		 * nome = JOptionPane.showInputDialog("Qual seu nome?");
		 * JOptionPane.showConfirmDialog(null, "O seu nome � " + nome + "?");
		 */

	
		
		String nome = null;
		int resposta;
		nome = JOptionPane.showInputDialog("Informe seu nome:");
		resposta = JOptionPane.showConfirmDialog(null, "Seu nome � " + nome + "?");
		if (resposta == JOptionPane.YES_OPTION) {
			System.out.println("Seu nome � " + nome);
		}else if (resposta == JOptionPane.NO_OPTION) {
			System.out.println("Seu nome n�o � " + nome);
		}
		
	}
}
