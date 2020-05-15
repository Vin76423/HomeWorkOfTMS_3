import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Задайте некоторое число n, которое должно быть больше 3: ");
        int length;

        while ( true ) {
            Scanner scanner = new Scanner(System.in);
            if ( scanner.hasNextInt() ) {
                length = scanner.nextInt();
                if ( length > 3) {
                    break;
                }
            }

            System.out.println("Попробуйте еще раз:");
        }

        int [] array1 = new int[length];
        int counter = 0;

        for ( int i = 0; i < length; i++ ) {
            array1 [i] = random.nextInt(length);
            System.out.print(array1 [i] + "  ");

            if (array1 [i] % 2 == 0) {
                counter++;
            }
        }

        System.out.println();

        if ( counter > 0 ) {
            int [] array2 = new int [counter];
            for ( int i = 0, j = 0; i < length; i++ ) {
                if ( array1 [i] % 2 == 0) {
                    array2 [j] = array1 [i];
                    System.out.print(array2[j] + "  ");
                    j++;
                }
            }
        } else {
            System.out.println("Первый массив не содержит четных чисел!");
        }
    }
}
