import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        int [] array = new int[10];
        int index = 0;

        for ( int i = 2; i <= 20; i += 2) {
            array [index] = i;
            index++;
        }

        for ( int x : array ) {
            System.out.print(x + " ");
        }

        System.out.println("\n");

        for ( int x : array ) {
            System.out.println(x);
        }
    }
}
