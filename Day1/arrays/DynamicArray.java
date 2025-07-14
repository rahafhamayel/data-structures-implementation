package arrays;

public class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;
    public DynamicArray() {
        capacity = 2;
        array = new int[capacity];
        size = 0;
    }
    public void add(int element) {
        if (size == capacity) {
            resize();
        }
        array[size] = element;
        size++;
    }
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }
    public void remove() {
        if (size > 0) {
            size--;
        } else {
            throw new IllegalStateException("Array is empty");
        }
    }
    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
    public int size() {
        return size;
    }
    public void print() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(10);
        da.add(20);
        da.add(30);
        da.print();

        System.out.println("Element at index 1: " + da.get(1));

        da.remove();
        da.print();
    }
}
