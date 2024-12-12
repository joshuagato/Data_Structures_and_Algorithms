import java.util.ArrayList;
import java.util.Arrays;

import arrays.Array;
import linkedlist.LinkedList;
import stacks.Expression;
import stacks.Stack;
import stacks.StringReverser;


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
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        System.out.println(list.size());
//        list.remove(3);
//        list.removeFirst();
//        System.out.println(list.indexOf(20));
//        System.out.println(list.lastIndexOf(30));
//        System.out.println(list.contains(30));
//        System.out.println(Arrays.toString(list.toArray()));
//
//        System.out.println(list);

        // Java's inbuilt LinkedList
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(40);
//        list.addFirst(10);
//        list.addFirst(10);
//        list.remove(2);
//        list.removeFirst();
//        list.removeLast();
//
//        System.out.println(list.contains(20));
//        System.out.println(list.indexOf(20));
//        System.out.println(list.lastIndexOf(30));
//        System.out.println(list.size());
//
//        System.out.println(Arrays.toString(list.toArray()));

//        System.out.println(list);

        // Our LinkedList class
//        var list = new LinkedList();
//        System.out.println("size: " + list.size());
//        list.addLast(20);
//        System.out.println("size: " + list.size());
//        list.addLast(30);
//        list.addLast(40);
//        list.addFirst(10);
//        list.addFirst(0);
//        list.removeFirst();
//        list.removeLast();
//        list.addLast(40);
//        list.addLast(50);
//        System.out.println("size: " + list.size());
//        System.out.println("indexOf: " + list.indexOf(30));
//        System.out.println("contains: " + list.contains(30));
//        System.out.println("contains: " + list.contains(40));
//
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//
//        list.reverse();
//        var reversed = list.toArray();
//        System.out.println(Arrays.toString(reversed));
//
//        System.out.println("getKthFromTheEnd: " + list.getKthFromTheEnd(3));

        // Java's inbuilt Stack class
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack);
//
//        var top = stack.pop();
//        System.out.println(top);
//
//        System.out.println(stack);
//
//        top = stack.peek();
//        System.out.println(top);
//
//        String str = "abcd";
//        System.out.println("str: " + str);
//        StringReverser reverser = new StringReverser();
//        var reversed = reverser.reverse(str);
//        System.out.println("rev: " + reversed);


        // Balanced expression checker
        // Edge cases: (,     ((),     (],     )(
//        String str = "(1 + 2)";
//        String str2 = "(1 + 2";
//        String str3 = "((1 + 2)";
//        String str4 = "(1 + 2]";
//        String str5 = ")1 + 2(";
//        Expression expression = new Expression();
//        var result = expression.isBalanced(str);
//        System.out.println(result);
//
//        System.out.println("str: " + expression.isBalanced(str));
//        System.out.println("str2: " + expression.isBalanced(str2));
//        System.out.println("str3: " + expression.isBalanced(str3));
//        System.out.println("str4: " + expression.isBalanced(str4));
//        System.out.println("str5: " + expression.isBalanced(str5));

        // Our Stack class using arrays
        Stack stack = new Stack();
        System.out.println("isEmpty: " + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("peek: " + stack.peek());
        stack.push(50);
        System.out.println(stack);
        System.out.println("peek: " + stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());
    }
}