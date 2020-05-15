import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {

        int [] array1 = new int[5];
        int [] array2 = new int[5];
        ArrayList<int[]> arrays = new ArrayList<int[]>();
        arrays.add(array1);
        arrays.add(array2);
        Random random = new Random();
        int [] counter = new int[2];

        int index = 0;

        for ( int [] array : arrays ) {

            for ( int x = 0; x < array.length; x++ ) {
                array [x] = random.nextInt(15);
                System.out.print( array [x] + " ");
                counter [index] += array [x];
            }

            System.out.println();
            counter [index] /= array.length;
            index++;
        }

        if ( counter [0] > counter [1] ) {
            System.out.println("Среднее арифметическое первого массива больше и равняется: " + counter[0]);
        } else if ( counter [0] < counter [1] ) {
            System.out.println("Среднее арифметическое второго массива больше и равняется: " + counter[1]);
        } else {
            System.out.println("Среднее арифметическое первого и втарого массивов равны");
        }
    }
}
