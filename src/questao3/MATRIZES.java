package questao3;

import java.util.Scanner;

public class MATRIZES {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int mat[][] = new int[3][5];
		System.out.println("Digite o numero que quer encontrar: ");
		x = sc.nextInt();
		boolean encontrado = false;
		System.out.println("================= Valores da MATRIZ =================");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				mat[i][j] = sc.nextInt();

			}
		}

		System.out.println("============= MATRIZ ===============");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mat[i][j] + "\t");

			}
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (mat[i][j] == x) {
					System.out.println("Encontrado");
					System.out.println("Linha:" + i);
					System.out.println("Coluna" + j);

				}

			}

		}
		if (encontrado == false) {
		}

		System.out.println("nao achei");
	}

}
