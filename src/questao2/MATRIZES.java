package questao2;

import java.util.Scanner;

public class MATRIZES {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mat[][] = new int[5][2];
		int produto = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				produto = produto * mat[i][j];
				System.out.print(mat[i][j] + "\t");

			}
			System.out.println();
		}

		System.out.println("Produto:" + produto);

	}

}
