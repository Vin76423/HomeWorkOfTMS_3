import java.util.Random;
import java.util.Scanner;

public class Task_1_extra {
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
        int sum = 0;

        for ( int i = 0; i < length; i++ ) {
           array [i] = 1 + random.nextInt(20);
           System.out.print(array [i] + "  ");

           if ( array [i] % 3 == 0 && sum == 0 ) {
               sum = array [i];
           } else if ( array [i] % 3 == 0 && sum != 0 ) {
               sum *= array [i];
           }
        }

        System.out.println();

        if ( sum > 0 ) {
            System.out.println("Произведение элементов массива, кратных 3-ём равняется: " + sum);
        } else {
            System.out.println("Массив не содержит элементы, кратные 3-ём");
        }
    }
}
