import java.util.Random;
import java.util.Scanner;

public class Task_3_extra {
    public static void main(String[] args) {

        Random random = new Random();

        int length = inputInt("Введите длинну массива: ");
        int number = inputInt("Введите некоторое число N: ");

        int [] array = new int[length];
        double sum = 0;
        int counter = 0;

        for ( int i = 0; i < length; i++ ) {
            array [i] = random.nextInt(20);
            System.out.print(array [i] + "  ");

            if ( array [i] > number ) {
                sum += array [i];
                counter++;
            }
        }

        System.out.println();
        System.out.println("Среднее арифметическое элементов массива, значения которых превышают" +
                " число " + number + ", равняется: " + sum/counter);
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
