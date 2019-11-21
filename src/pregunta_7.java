import java.util.Scanner;

public class pregunta_7 {

    public static void recorrerMatriz(int [][] matrix) {
        int cont = 0;
        int filasSupLeidas = 0;
        int filasInfLeidas = 0;
        int columnDerLeidas = 0;
        int columnIzqLeidas = 0;
        while(cont < matrix.length*matrix.length) {
            for(int i= columnIzqLeidas; i < matrix.length - columnDerLeidas ; i++) {
                System.out.println(matrix[filasSupLeidas][i]);
                cont++;
            }
            filasSupLeidas++;
            if(cont < matrix.length*matrix.length) {
                for (int i = filasSupLeidas; i < matrix.length - filasInfLeidas; i++) {
                    System.out.println(matrix[i][matrix.length - columnDerLeidas - 1] );
                    cont++;
                }
                columnDerLeidas++;
            }
            if(cont < matrix.length*matrix.length) {
                for (int i = matrix.length - columnDerLeidas - 1; i >= columnIzqLeidas; i--) {
                    System.out.println(matrix[matrix.length - filasInfLeidas - 1][i]);
                    cont++;
                }
                filasInfLeidas++;
            }
            if(cont < matrix.length*matrix.length) {
                for (int i = matrix.length - filasInfLeidas - 1; i >= filasSupLeidas; i--) {
                    System.out.println(matrix[i][columnIzqLeidas]);
                    cont++;
                }
                columnIzqLeidas++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrizEj = {{1, 2, 3, 4},
                            {12, 13, 14, 5},
                            {11, 16, 15, 6},
                            {10, 9, 8, 7}
                        };
        recorrerMatriz(matrizEj);
    }

}
