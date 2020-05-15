import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_10_extra {
    public static void main(String[] args) {

        Random random = new Random();

        int length = inputInt("Введите длинну массива: ");
        int [] array = new int[length];

        for ( int i = 0; i < length; i++ ) {
            array [i] = random.nextInt(10);
            System.out.print(array [i] + "  ");
        }

        int maxIndex = 0;
        int max = array [0];

        for ( int i = 0; i < length; i++ ) {
            if ( max < array [i] ) {
                max = array [i];
                maxIndex = i;
            }
        }

        System.out.println();
        int [] newArray = new int[length];

        for ( int i = 0; i < length; i++ ) {
            if ( i == 0 ) {
                newArray [i] = max;
            } else  if ( i == maxIndex ) {
                newArray [i] = array [0];
            } else {
                newArray [i] = array [i];
            }

            System.out.print(newArray [i] + "  ");
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
