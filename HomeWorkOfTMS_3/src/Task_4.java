import java.util.Arrays;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {

        int [] array = new int[20];
        Random random = new Random();

        for ( int x = 0; x < array.length; x++ ) {
            array [x] = random.nextInt(20);
            System.out.print( array [x] + " ");
        }

        System.out.println();

        for ( int x = 0; x < array.length; x++ ) {
            if ( x % 2 != 0 ) {
                array [x] = 0;
            }
            System.out.print( array [x] + " ");
        }

    }
}
