import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_7_extra {
    public static void main(String[] args) {

        Random random = new Random();

        int length = inputInt("Введите длинну массива: ");
        int number = inputInt("Введите значение для поиска: ");
        int [] array = new int[length];

        int counter = 0;

        for ( int i = 0; i < length; i++ ) {
            array [i] = random.nextInt(10);
            System.out.print(array [i] + "  ");

            if ( array [i] == number ) {
                counter++;
            }
        }

        System.out.println();
        System.out.println("Число " + number + " встречается в данном массиве " + counter + " раз");
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
