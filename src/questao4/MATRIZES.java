package questao4;

import java.util.Scanner;

public class MATRIZES {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Z[][] = new int[3][4];
		int menor = 999;
		int maior = 0;

		int linhaMenor = 0;
		int colunaMenor = 0;

		int linhaMaior = 0;
		int colunaMaior = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				Z[i][j] = sc.nextInt();
				if (Z[i][j] < menor) {
					menor = Z[i][j];
					linhaMenor = i;
					colunaMenor = j;

				}
				if (Z[i][j] > maior) {
					maior = Z[i][j];
					linhaMaior = i;
					colunaMaior = j;

				}

			}
		}

		System.out.println("============= MATRIZ ===============");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(Z[i][j] + "\t");

			}
			System.out.println();
		}

		System.out.println("Menor numero digitado é: " + menor);
		System.out.println("Na linha:" + linhaMenor);
		System.out.println("Na coluna:" + colunaMenor);

		System.out.println("Maior numero digitado é: " + maior);
		System.out.println("Na linha:" + linhaMaior);
		System.out.println("Na coluna:" + linhaMaior);

	}

}
