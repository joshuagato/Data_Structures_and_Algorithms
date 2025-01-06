package liner.arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // If the array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; i++) newItems[i] = items[i];
//            System.arraycopy(items, 0, newItems, 0, count);

            // Set "items" to this new array
            items = newItems;
        }

        // Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= count) throw new IllegalArgumentException("index out of bounds");

        // Shift the items to the left to fill the hole
        // [10, 30, 40]
        // index: 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    public int indexOf(int item) {
        // If we find it, return index
        // Otherwise, return -1

        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) return i;
        }

        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) System.out.println(items[i]);
    }
}
