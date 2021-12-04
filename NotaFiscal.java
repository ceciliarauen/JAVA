import javax.swing.JOptionPane;

public class NotaFiscal {

	public static void main(String[] args) {
		/*
		 * - Desenvolva um programa que permita informar a quantidade de itens vendidos.OK
		 * 
		 * - Em seguida peça o código, descrição, valor unitário e quantidade vendida. OK
		 * 
		 * - Para cada item, imprimir os dados, calcular o valor total do item. OK
		 * 
		 * - Ao final do programa imprimir o valor total da nota. OK
		 */

		int itensVendidos, unidadesVendidas, contaProdutos;
		double valorUnitario, valorTotalItem, valorNota = 0;
		String cod, descricao;

		itensVendidos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos vendidos:"));
		contaProdutos = 0;
		while (contaProdutos < itensVendidos) {
			cod = JOptionPane.showInputDialog("Informe o codigo do produto:");
			descricao = JOptionPane.showInputDialog("Descrição do produto:");
			valorUnitario = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
			unidadesVendidas = Integer.parseInt(JOptionPane.showInputDialog("Unidades:"));
			valorTotalItem = valorUnitario * unidadesVendidas;

			System.out.println("CÓD. PRODUTO " + cod + "........ " + descricao);
			System.out.println("Valor: R$" + valorUnitario + "x" + unidadesVendidas + " R$" + valorTotalItem + "\n");
			System.out.println("-----------------------------------------\n");
			valorNota += valorTotalItem;

			contaProdutos++;
		}
		System.out.println("o valor final da nota é R$" + valorNota);
		System.out.println("Obrigado por comprar conosco! :D");
	}

}
