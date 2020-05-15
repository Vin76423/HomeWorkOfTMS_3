import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5_extra {
    public static void main(String[] args) {

        Random random = new Random();

        int length = inputInt("Введите длинну массива: ");
        int newLength;

        int [] array1 = new int[length];
        for ( int i = 0; i < length; i++ ) {
            array1 [i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array1));


        if ( length % 2 == 0 ) {
            newLength =length / 2;
        } else {
            newLength = length / 2 + 1;
        }


        int [] array2 = new int[newLength];
        for ( int i = 0, j = 0; i < length; i++ ) {
            if ( i % 2 == 0 ) {
                array2 [j] = array1 [i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array2));


        int [] array3 = new int[length];
        for ( int i = 0, j = 0; i < length; i++ ) {
            if ( i % 2 == 0 ) {
                array3 [i] = array2 [j];
                j++;
            } else {
                array3 [i] = 0;
            }
        }
        System.out.println(Arrays.toString(array3));
    }

    public static int inputInt ( String message ) {
        System.out.println(message);
        int value;

        while ( true ) {
            Scanner scanner = new Scanner(System.in);
            if ( scanner.hasNextInt() ) {
                value = scanner.nextInt();
                if ( value > 0) {
                    break;
                }
            }

            System.out.println("Значение не корректно, попробуйте еще раз:");
        }

        return value;
    }
}
