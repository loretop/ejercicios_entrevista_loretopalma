import java.util.Scanner;

public class pregunta_2 {

  public static boolean balanceado(String parentesis) {
        int izq = 0;
        int der = 0;
        for(int i = 0; i < parentesis.length() ; i++) {
                if(parentesis.charAt(i) == '(') {
                    izq++;
                }
                if(parentesis.charAt(i) == ')') {
                    der++;
                    if(der > izq) {
                        return false;
                    }
                }
        }
        return izq == der;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        System.out.print( "Ingresar paréntesis: " );
        String a = s.nextLine();
        System.out.println(balanceado(a));
    }
}
