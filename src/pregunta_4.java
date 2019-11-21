import java.util.ArrayList;
import java.util.Scanner;

public class pregunta_4 {

    public static void primosHasta(int numero) {
        ArrayList<Integer> primos = new ArrayList<>();
        int i = 2;
        while(i <= numero) {
            if (primos.size() == 0) {
                primos.add(i);
            } else {
                boolean esPrimo = true;
                for (int j = 0; j < primos.size() - 1; j++) {
                    if (i % primos.get(j) == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo == true) {
                    primos.add(i);
                }
            }
            i++;
        }
        for(int x = 0; x < primos.size(); x++) {
            System.out.println(primos.get(x));
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        System.out.print( "Ingresar número: " );
        int a = s.nextInt();
        primosHasta(a);
    }
}
