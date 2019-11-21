import java.util.Scanner;

public class pregunta_1 {

    public static boolean palindromo(String palabra) {
        int i = 0;
        int j = palabra.length() - 1;
        while(i < j) {
            if(palabra.charAt(i) == palabra.charAt(j)) {
                i++;
                j--;
            }
            if(palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
        }
        return i >= j;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        System.out.print( "Ingresar palabra: " );
        String a = s.nextLine();
        System.out.println(palindromo(a));
    }

}
