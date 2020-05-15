import java.util.Random;
import java.util.Scanner;

public class Task_4_extra {
    public static void main(String[] args) {

        Random random = new Random();
        int length = inputInt("Введите длинну массива (более 1): ");

        int [] array = new int[length];

        for ( int i = 0; i < length; i++ ) {
            array [i] = random.nextInt(20);
            System.out.print(array [i] + "  ");
        }

        int min = array [1];

        for ( int i = 0; i < length; i++ ) {
            if ( i != 0 && i % 2 != 0 && array [i] < min ) {
                min = array [i];
            }
        }

        System.out.println();
        System.out.println("Наименьший нечетный элемент заданного массива имеет значение: " + min);
    }

    public static int inputInt ( String message ) {
        System.out.println(message);
        int value;

        while ( true ) {
            Scanner scanner = new Scanner(System.in);
            if ( scanner.hasNextInt() ) {
                value = scanner.nextInt();
                if ( value > 1) {
                    break;
                }
            }

            System.out.println("Значение не корректно, попробуйте еще раз:");
        }

        return value;
    }
}
