import java.util.Random;

public class Task_7 {
    public static void main(String[] args) {

        int [] array = new int[12];
        Random random = new Random();

        for ( int x = 0; x < array.length; x++ ) {
            array [x] = random.nextInt(15);
            System.out.print( array [x] + " ");
        }

        int index = 0;
        int max = array [0];

        for ( int x = 0; x < array.length; x++ ) {
            if ( array [x] > max) {
                max = array [x];
                index = x;
            }
        }

        System.out.println();
        System.out.println("Максимальным значением в массиве является число: " + max + " и находится пд индексом: " + index);
    }
}
