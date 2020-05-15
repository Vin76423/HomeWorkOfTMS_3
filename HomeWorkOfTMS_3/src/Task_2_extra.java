import java.util.Random;
import java.util.Scanner;

public class Task_2_extra {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Задайте длинну массива: ");
        int length;

        while ( true ) {
            Scanner scanner = new Scanner(System.in);
            if ( scanner.hasNextInt() ) {
                length = scanner.nextInt();
                if ( length > 0) {
                    break;
                }
            }

            System.out.println("Попробуйте еще раз:");
        }

        //........

        int [] array = new int[length];
        double sum = 0;
        int counter = 0;

        for ( int i = 0; i < length; i++ ) {
            array [i] = random.nextInt(20);
            System.out.print(array [i] + "  ");

            if ( i % 2 != 0 ) {
                sum += array [i];
                counter++;
            }
        }

        System.out.println();
        System.out.println("Среднее арифметическое не четных элементов массива равняется: " + sum/counter);
    }
}
