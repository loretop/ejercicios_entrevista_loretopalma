import java.util.Arrays;

import static java.lang.System.exit;

public class pregunta_10 {

    public static int[][] multiplicar(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        if(a[0].length != b.length) {
            System.out.println("Dimensiones no coinciden");
            exit(0);
        }
        else {
            for(int i = 0; i < a.length ; i++) {
                for(int j = 0; j < b[0].length; j++) {
                    int value = 0;
                    for(int k = 0; k < a[0].length; k++) {
                        value+=a[i][k]*b[k][j];
                    }
                    c[i][j] = value;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[][] matrizA = {{1, 2},
                {-1, 0},
                {-3, -1}
        };
        int[][] matrizB = {{2, 0, 1},
                {-5, 2, 3}
        };
        int[][] c = multiplicar(matrizA,matrizB);
        for (int[] fila : c)
            System.out.println(Arrays.toString(fila));
    }
}

