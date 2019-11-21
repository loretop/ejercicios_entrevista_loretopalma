import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class pregunta_9 {

    public static void ordenar(ArrayList<Integer> lista, int indiceIni, int indiceFin) {
        int pivote = lista.get(indiceFin);
        int i = indiceIni;
        int j = indiceFin-1;
        while(i < j) {
            if(lista.get(i) > pivote && lista.get(j) < pivote) {
                int aux = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, aux);
                i++;
                j--;
            }
            if(lista.get(i) < pivote && i < j) {
                i++;
            }
            if(lista.get(j) > pivote && i < j) {
                j--;
            }
        }

        int aux = lista.get(i);
        lista.set(i, pivote);
        lista.set(indiceFin, aux);
        if(indiceFin != indiceIni) {
            ordenar(lista, indiceIni, i-1);
            ordenar(lista, i+1, indiceFin);
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(5, 3, 7, 6, 2, 1, 4));
        ordenar(a, 0, 6);
        System.out.println(Arrays.toString(a.toArray()));
    }
}
