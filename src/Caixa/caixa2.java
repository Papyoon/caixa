package Caixa;

public class caixa2 {
private int linhas;
private int colunas;
 public caixa2(int linhas, int colunas) {
	 this.linhas = linhas;
	 this.colunas = colunas;
 }
 public void imprimir() {
		horizontal1(colunas);
		vertical(linhas, colunas);
		horizontal1(colunas);

 }

	private static void horizontal1(int colunas) {
		for (int i = 0; i < colunas; i++) {
			System.out.print("0");
		}
		System.out.println("");

	}

	private static void vertical(int linhas, int colunas) {
		for (int i = 0; i < linhas; i++) {
			System.out.print("0");
			for (int x = 0; x < colunas -2; x++) {
				System.out.print(" ");
			}
			System.out.print("0");
			System.out.println("");
		}
	}
}


