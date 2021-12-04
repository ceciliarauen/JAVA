import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String[] args) {
//TABUADA DE 1 A 10
		/*
		 * for (int contador = 1; contador <= 10; contador++) { 
		 * for (int multiplicador = 0; multiplicador <= 10; multiplicador++) 
		 * System.out.print(contador * multiplicador + " "); 
		 * System.out.print("   ");
		 * }
		 * 
		 * System.out.println();
		 */
//Tabuada do numero informado pelo usuario 		
		int numeroMultiplicador = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero para multiplicar:"));
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * numeroMultiplicador + " ");
			System.out.print("   ");
		}
		
	}
}
