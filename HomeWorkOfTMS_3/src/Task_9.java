import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_9 {
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

            System.out.println("Вы ввели не корректное число, введите еще раз:");
        }

        int [] array = new int[length];

        int sumOfLeftPart = 0;
        int sumOfRightPart = 0;
        int middle = length/2;

        for ( int i = 0; i < array.length; i++ ) {
            array [i] = random.nextInt(15);
            System.out.print(array [i] + "  ");

            if ( i < middle ) {
                sumOfLeftPart += array [i];
            } else {
                sumOfRightPart += array [i];
            }
        }

        System.out.println();
        if ( sumOfLeftPart > sumOfRightPart ) {
            System.out.println("Сумма ЛЕВОЙ части массива больше и составляет: " + sumOfLeftPart);
        } else if ( sumOfLeftPart < sumOfRightPart ) {
            System.out.println("Сумма ПРАВОЙ части массива больше и составляет: " + sumOfRightPart);
        } else {
            System.out.println("Сумма ЛЕВОЙ и ПРАВОЙ частей массива равны: " + sumOfLeftPart);
        }
    }
}
