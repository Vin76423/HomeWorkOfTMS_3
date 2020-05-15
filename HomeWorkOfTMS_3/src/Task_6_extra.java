import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_6_extra {
    public static void main(String[] args) {

        Random random = new Random();

        int length = inputInt("Введите длинну массива: ");
        int [] array = new int[length];

        for ( int i = 0; i < length; i++ ) {
            array [i] = random.nextInt(20);
            System.out.print(array [i] + "  ");
        }

        boolean answer = true;

        for ( int i = 0; i < length; i++ ) {
            for ( int j = i + 1; j < length; j++ ) {
                if ( array [i] == array [j] ) {
                    answer = false;
                    break;
                }
            }
        }

        System.out.println();

        if ( answer ) {
            System.out.println("Вданном массиве нет одинаковых (повторяющихся) элементов");
        } else {
            System.out.println("Вданном массиве есть повторяющиеся значения");
        }
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
