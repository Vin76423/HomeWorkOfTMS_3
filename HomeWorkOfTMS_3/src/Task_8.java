import java.util.Arrays;
import java.util.Random;

public class Task_8 {
    public static void main(String[] args) {

        int [] array1 = new int[10];
        int [] array2 = new int[10];
        double [] array3 = new double[10];

        filler(array1, 10);
        filler(array2, 10);

        for ( int i = 0; i < 10; i++ ) {
            if ( array2 [i] != 0 ) {
                array3 [i] = (double) array1 [i] / array2 [i];
            } else {
                array3 [i] = 0.0;
            }
        }

        writer(array1);
        writer(array2);

        int counter = 0;
        for ( int i = 0; i < 10; i ++ ) {
            System.out.print(array3 [i] + "  ");
            if ( array3 [i] == (int) array3 [i] ) {
                counter++;
            }
        }

        System.out.println();
        System.out.println("Колличество целых чисел в третьем массиве: " + counter);
     }



     public static void filler ( int [] array, int border ) {
        Random random = new Random();
        for ( int i = 0; i < array.length; i++ ) {
            array [i] = random.nextInt(border);
        }
     }

     public static void writer ( int [] array ) {
        for ( int i = 0; i < array.length; i++ ) {
            System.out.print(array [i] + "  ");
        }
        System.out.println();
     }
}
