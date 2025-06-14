package ASSIGNMENT7;
import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        while (true) {
            System.out.println("\n**** MENU ****");
            System.out.println("0: Exit");
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Peek (Front Element)");
            System.out.println("4: Display");
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
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
