public class Questão2 {
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] B = new int[10];

        // Preenche B com A[i] * i
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * i;
        }

        // Exibe os vetores A e B
        System.out.println("Índice |  A[i]  |  B[i] = A[i] * i");
        System.out.println("----------------------------------");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("  %2d   |  %3d   |     %3d\n", i, A[i], B[i]);
        }
    }
}

