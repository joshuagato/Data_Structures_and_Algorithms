import java.util.ArrayList;
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

        // Our Array class
//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        numbers.removeAt(1);
//        System.out.println("Index of {10}: " + numbers.indexOf(10));
//        System.out.println("Index of {100}: " + numbers.indexOf(100));
//        numbers.print();


        // Java's inbuilt ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size());
        list.remove(3);
        list.removeFirst();
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.contains(30));
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println(list);
    }
}