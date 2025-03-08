package Day2.Queue.CircularBufferSimulation;

public class CircularBuffer {
    private int[] buffer;
    private int head, tail, size, capacity;
 
 
    // Constructor
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }
 
 
 
 
    public void insert(int value) {
        if (size == capacity) {
            // Overwriting the oldest element
            head = (head + 1) % capacity;
        } else {
            size++;
        }
 
 
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
    }
 
 
    public void printBuffer() {
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(head + i) % capacity] + " ");
        }
        System.out.println();
    }
 
 
    // Main method
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
 
 
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer();
 
 
        cb.insert(4);
        cb.printBuffer();
 
 
        cb.insert(5);
        cb.printBuffer();
    }
 }
 
