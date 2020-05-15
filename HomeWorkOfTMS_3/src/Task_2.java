import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {

        int [] array = new int[50];
        int index = 0;

        for ( int i = 1; i <= 99; i += 2) {
            array [index] = i;
            index++;
        }

        for ( int x : array ) {
            System.out.print(x + " ");
        }

        System.out.println("\n");

        int size = array.length;
        while ( size-- > 0) {
            System.out.print(array[size] + " ");
        }
    }
}
