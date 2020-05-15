import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {

        int [] array = new int[4];
        Random random = new Random();

        for ( int x = 0; x < array.length; x++ ) {
            array [x] = random.nextInt(10);
            System.out.print( array [x] + " ");
        }

        System.out.println();
        boolean answer = true;

        for ( int x = 0; x < array.length; x++ ) {
            for ( int n = x + 1; n < array.length; n++) {
                if ( array [n] <= array [x] ) {
                    answer = false;
                }
            }
        }

        if ( answer ) {
            System.out.println("Это строго возрастающая последовательность :)");
        } else {
            System.out.println("Нет, это не строго возрастающая последовательность :(");
        }
    }
}
