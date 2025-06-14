package ASSIGNMENT7;
import java.util.Scanner;

public class QueueUsingArray {
    private int[] array;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = value;
        size++;
        System.out.println("Enqueued " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = array[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return array[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(array[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingArray queue = new QueueUsingArray(5);

        while (true) {
            System.out.println("\n***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Peek (Front Element)");
            System.out.println("4: Display");
            System.out.println("5: Check if Empty");
            System.out.println("6: Check if Full");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int val = sc.nextInt();
                    queue.enqueue(val);
                    break;
                case 2:
                    int removed = queue.dequeue();
                    if (removed != -1)
                        System.out.println("Dequeued: " + removed);
                    break;
                case 3:
                    int frontVal = queue.peek();
                    if (frontVal != -1)
                        System.out.println("Front element: " + frontVal);
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println(queue.isEmpty() ? "Queue is empty" : "Queue is not empty");
                    break;
                case 6:
                    System.out.println(queue.isFull() ? "Queue is full" : "Queue is not full");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
