import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {

        int [] array = new int[15];
        Random random = new Random();
        int counter = 0;

        for ( int x = 0; x < array.length; x++ ) {
            array [x] = random.nextInt(100);
            if ( array [x] % 2 == 0 ){
                counter++;
            }
        }

        System.out.println(Arrays.toString(array) + "\nКолличество четных чисел = " + counter);

    }
}
