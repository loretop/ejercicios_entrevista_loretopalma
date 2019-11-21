public class pregunta_5 {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i%3 == 0 && i%5 != 0) {
                System.out.println("Fala");
            }
            if(i%5 == 0 && i%3 != 0) {
                System.out.println("Bella");
            }
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("Falabella");
            }
            if(i%3 != 0 && i%5 != 0) {
                System.out.println(i);
            }
        }

    }

}
