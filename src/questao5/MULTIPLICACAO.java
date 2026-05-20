package questao5;

public class MULTIPLICACAO {

	public static void main(String[] args) {

		int A[][] = new int[][] { { 2, 5, 6 }, { 3, 6, 10 }, { 1, 7, 10 } };

		int B[][] = new int[][] { { 4, 10, 6 }, { 4, 7, 1 }, { 6, 7, 8 } };

		int C[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				C[i][j] = A[i][j] * B[i][j];

			}
		}
		System.out.println("=========== MATRIZ A ===========");

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				System.out.print(A[i][j] + "\t");
			}

			System.out.println();
		}
		System.out.println("\n=========== MATRIZ B ===========");

		for (int i = 0; i < B.length; i++) {

			for (int j = 0; j < B[i].length; j++) {

				System.out.print(B[i][j] + "\t");
			}

			System.out.println();
		}

		System.out.println("================== MATRIZ C =================");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(C[i][j] + "\t");

			}
			System.out.println();
		}
	}
}