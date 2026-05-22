package questao6;

import java.util.Scanner;

public class MATRIZES {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mat[][] = new int[4][4];
		lerMatriz(mat, sc);
		valorMatriz(mat);
		somaDiagonal(mat);
	}

	public static void lerMatriz(int mat[][], Scanner sc) {
		System.out.println("================== DIGITE OS ELEMENTOS DA MATRIZ ===================");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
	}

	public static void valorMatriz(int mat[][]) {
		System.out.println("================== ELEMENTOS DA MATRIZ ===================");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void somaDiagonal(int mat[][]) {
		int soma = 0;

		for (int i = 0; i < 4; i++) {
			soma += mat[i][i];
		}

		System.out.println("Soma da diagonal principal: " + soma);

	}

}