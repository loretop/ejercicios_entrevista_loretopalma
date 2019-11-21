import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class pregunta_8 {

    public static String aRomano(int number) {
        StringBuilder s = new StringBuilder("");
        while(number != 0) {
            if(number == 1000) {
                System.out.println("M");
                break;
            }
            if(number>=100) {
                if(number/100 < 4) {
                    for(int i = 1; i <= number/100 ; i++) {
                        s.append("C");
                    }
                }
                if(number/100 == 4) {
                    s.append("CD");
                }
                if(number/100 > 4 && number/100 < 9) {
                    s.append("D");
                    int j = number/100;
                    while(j - 5 > 0) {
                        s.append("C");
                        j--;
                    }
                }
                if(number/100 == 9) {
                    s.append("CM");
                }
                number %= 100;
            }
            if(number < 100 && number >= 10) {
                if(number/10 < 4) {
                    for(int i = 1; i <= number/10 ; i++) {
                        s.append("X");
                    }
                }
                if(number/10 == 4) {
                    s.append("XL");
                }
                if(number/10 > 4 && number/10 < 9) {
                    s.append("L");
                    int j = number/10;
                    while(j - 5 > 0) {
                        s.append("X");
                        j--;
                    }
                }
                if(number/10 == 9) {
                    s.append("XC");
                }
                number %= 10;
            }
            if(number < 10) {
                if(number < 4) {
                    for(int i = 1; i <= number ; i++) {
                        s.append("I");
                    }
                }
                if(number == 4) {
                    s.append("IV");
                }
                if(number > 4 && number < 9) {
                    s.append("V");
                    int j = number;
                    while(j - 5 > 0) {
                        s.append("I");
                        j--;
                    }
                }
                if(number == 9) {
                    s.append("IX");
                }
                number = 0;
            }
        }
        System.out.println(s);
        return s.toString();

    }

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        System.out.print( "Ingresar número: " );
        int a = s.nextInt();
        aRomano(a);
    }
}
