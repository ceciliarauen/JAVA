import javax.swing.JOptionPane;

public class VendaCarro {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba o valor de um carro mostre uma tabela com os
		 * seguintes dados: preço final, quantidade de parcelas e valor da parcela.
		 * 
		 * 
		 * O preço final para compra à vista tem um desconto de 20%; A prazo a
		 * quantidade de parcelas pode ser: 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60.
		 * 
		 * Os percentuais de acréscimo são:
		 * 
		 * Parcelas Acréscimo 6 3% / 12 6% / 18 9% / 24 12% / 30 15% / 36 18% / 42 21% /
		 * 48 24% / 54 27% / 60 30% 11cases
		 */

		float vlrCarro, vlrParcela = 0, vlrFinal, percentual;
		int nmrParcelas;
		
		vlrCarro = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do carro"));
		nmrParcelas = Integer.parseInt(JOptionPane.showInputDialog("Informe em quantas vezes de deseja parcelar \n"
				+ "1x - 20% de desconto" + "\n" + "6x - 3% de acréscimo" + "\n" + "12x - 6% de acréscimo" + "\n"
				+ "18x - 9% de acréscimo" + "\n" + "24x - 12% de acréscimo" + "\n" + "30x - 15% de acréscimo" + "\n"
				+ "36x - 18% de acréscimo" + "\n" + "42x - 21% de acréscimo" + "\n" + "48x - 24% de acréscimo" + "\n"
				+ "54x - 27% de acréscimo" + "\n" + "60x - 30% de acréscimo" + "\n"));

		switch (nmrParcelas) {
		case 1: {
			percentual = 20.0f / 100;
			vlrFinal = vlrCarro - (vlrCarro * percentual);
			System.out.println("O valor final ficou R$" + vlrFinal + " à vista");
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
			JOptionPane.showMessageDialog(null, "Opção Inválida");
		}
		}
	}
