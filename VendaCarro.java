import javax.swing.JOptionPane;

public class VendaCarro {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba o valor de um carro mostre uma tabela com os
		 * seguintes dados: pre�o final, quantidade de parcelas e valor da parcela.
		 * 
		 * 
		 * O pre�o final para compra � vista tem um desconto de 20%; A prazo a
		 * quantidade de parcelas pode ser: 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60.
		 * 
		 * Os percentuais de acr�scimo s�o:
		 * 
		 * Parcelas Acr�scimo 6 3% / 12 6% / 18 9% / 24 12% / 30 15% / 36 18% / 42 21% /
		 * 48 24% / 54 27% / 60 30% 11cases
		 */

		float vlrCarro, vlrParcela = 0, vlrFinal, percentual;
		int nmrParcelas;
		
		vlrCarro = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do carro"));
		nmrParcelas = Integer.parseInt(JOptionPane.showInputDialog("Informe em quantas vezes de deseja parcelar \n"
				+ "1x - 20% de desconto" + "\n" + "6x - 3% de acr�scimo" + "\n" + "12x - 6% de acr�scimo" + "\n"
				+ "18x - 9% de acr�scimo" + "\n" + "24x - 12% de acr�scimo" + "\n" + "30x - 15% de acr�scimo" + "\n"
				+ "36x - 18% de acr�scimo" + "\n" + "42x - 21% de acr�scimo" + "\n" + "48x - 24% de acr�scimo" + "\n"
				+ "54x - 27% de acr�scimo" + "\n" + "60x - 30% de acr�scimo" + "\n"));

		switch (nmrParcelas) {
		case 1: {
			percentual = 20.0f / 100;
			vlrFinal = vlrCarro - (vlrCarro * percentual);
			System.out.println("O valor final ficou R$" + vlrFinal + " � vista");
		}
		case 6: {
			percentual = 3.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			break;
		}
		case 12: {
			percentual = 6.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			 System.out.println("O valor final ficou R$" + vlrFinal + ", em " + nmrParcelas + "x de " + vlrParcela);
			 break;
		}
		case 18: {
			percentual = 9.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			System.out.println("O valor final ficou R$" + vlrFinal + ", em " + nmrParcelas + "x de " + vlrParcela);
			break;
		}
		case 24: {
			percentual = 12.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			System.out.println("O valor final ficou R$" + vlrFinal + ", em " + nmrParcelas + "x de " + vlrParcela);
			break;
		}
		case 30: {
			percentual = 15.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			System.out.println("O valor final ficou R$" + vlrFinal + ", em " + nmrParcelas + "x de " + vlrParcela);
			break;
		}
		case 36: {
			percentual = 18.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			System.out.println("O valor final ficou R$" + vlrFinal + ", em " + nmrParcelas + "x de " + vlrParcela);
			break;
		}
		case 42: {
			percentual = 21.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			System.out.println("O valor final ficou R$" + vlrFinal + ", em " + nmrParcelas + "x de " + vlrParcela);
			break;
		}
		case 48: {
			percentual = 24.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			System.out.println("O valor final ficou R$" + vlrFinal + ", em " + nmrParcelas + "x de " + vlrParcela);
			break;
		}
		case 54: {
			percentual = 27.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			System.out.println("O valor final ficou R$" + vlrFinal + ", em " + nmrParcelas + "x de " + vlrParcela);
			break;
		}
		case 60: {
			percentual = 30.0f / 100;
			vlrFinal = vlrCarro + (vlrCarro * percentual);
			vlrParcela = vlrFinal/nmrParcelas;
			System.out.println("O valor final ficou R$" + vlrFinal + ", em " + nmrParcelas + "x de " + vlrParcela);
			break;
		
		}default:
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
		}
		}
	}
