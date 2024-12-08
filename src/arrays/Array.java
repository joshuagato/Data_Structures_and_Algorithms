package arrays;

public class Array {
    private int[] items;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int item : items) System.out.println(item);
    }
}
