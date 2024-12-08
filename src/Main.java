import java.util.Arrays;
import arrays.Array;


public class Main {
    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;

//        int[] numbers = { 10, 20, 30 };
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();
    }
}