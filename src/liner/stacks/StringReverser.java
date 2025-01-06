package liner.stacks;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null || input.isEmpty()) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        // We won't use this one but the next and cleaner one
//        for (int i = 0; i < input.length(); i++) stack.push(input.charAt(i));

        for (char ch : input.toCharArray()) stack.push(ch);

        // We won't use this since strings are immutable in java and for that matter, for each iteration a new memory,
        // space will be allocated for this string concatenation operation
//        String reversed = "";
//        while (!stack.isEmpty()) reversed += stack.pop();

//        StringBuilder reversed = new StringBuilder();
        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        return reversed.toString();
    }
}
