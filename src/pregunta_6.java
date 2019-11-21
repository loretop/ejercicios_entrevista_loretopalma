import java.util.Scanner;

public class pregunta_6 {

    public static void toHex(int numero) {
        int resultado = numero;
        StringBuilder sb = new StringBuilder("");
        while(resultado > 0 ) {
            int resto = resultado % 16;
            resultado /= 16;
            if(resto == 10) {
                sb.insert(0, 'A');
            }
            if(resto == 11) {
                sb.insert(0, 'B');
            }
            if(resto == 12) {
                sb.insert(0, 'C');
            }
            if(resto == 13) {
                sb.insert(0, 'D');
            }
            if(resto == 14) {
                sb.insert(0, 'E');
            }
            if(resto == 15) {
                sb.insert(0, 'F');
            }
            if (resto < 10) {
                sb.insert(0, resto);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        System.out.print( "Ingresar número decimal: " );
        int a = s.nextInt();
        toHex(a);
    }

}
