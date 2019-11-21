import java.util.ArrayList;

public class pregunta_3 {

    public static ArrayList<Integer> sucesor(ArrayList<Integer> numero) {
        int sucesor = 0;
        int potencia = 1;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = numero.size() - 1; i >= 0; i--) {
            sucesor += numero.get(i)*potencia;
            potencia *= 10;
        }
        sucesor += 1;
        String s = String.valueOf(sucesor);
        for(int i = 0; i <= s.length() - 1; i++) {
            int integer = Character.getNumericValue(s.charAt(i));
            result.add(integer);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ej = new ArrayList<>();
        ej.add(0,1);
        ej.add(1, 2);
        ej.add(2,5);
        ej.add(3, 3);
        System.out.println(sucesor(ej));
    }
}
