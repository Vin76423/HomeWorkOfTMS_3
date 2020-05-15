import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_8_extra {
    public static void main(String[] args) {

        Random random = new Random();

        int length = inputInt("Введите длинну массива: ");
        int [] array = new int[length];

        for ( int i = 0; i < length; i++ ) {
            array [i] = random.nextInt(20);
            System.out.print(array [i] + "  ");
        }

        int max = array [0];
        int beforeMax = array [0];

        for ( int x : array ) {
            if (x > max) {
                max = x;
            }
        }

        for ( int x : array ) {
            if ( x > beforeMax && x < max) {
                beforeMax = x;
            }
        }

        System.out.println();
        System.out.println("Значение второгопо величине элемента массива равняется: " + beforeMax);
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
