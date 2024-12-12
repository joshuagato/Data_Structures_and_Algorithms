package stacks;

import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    private int counter;

    public void push(int item) {
        if (counter == items.length) throw new StackOverflowError();
        items[counter++] = item;
    }

    public int pop() {
        if (counter == 0) throw new IllegalStateException();
        return items[--counter];
    }

    public int peek() {
        if (counter == 0) throw new IllegalStateException();
        return items[counter - 1];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(items, counter));
    }
}
