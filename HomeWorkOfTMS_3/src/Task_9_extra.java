import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_9_extra {
    public static void main(String[] args) {

        Random random = new Random();

        int length = inputInt("Введите длинну массива: ");
        int [] array = new int[length];

        for ( int i = 0; i < length; i++ ) {
            array [i] = random.nextInt(20);
            System.out.print(array [i] + "  ");
        }

        int min = array [0];

        for ( int i = 0; i < length; i++ ) {
            if ( i % 2 == 0 && min > array [i] ) {
                min = array [i];
            }
        }

        System.out.println();
        System.out.println("Наименьшее значение массива с четным индексом: " + min);
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
