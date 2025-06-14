package ASSIGNMENT6;
import java.util.Scanner;

public class StackUsingArray {
    private int[] array;
    private int top;
    private int capacity;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = value;
        System.out.println("Pushed " + value + " into the stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingArray stack = new StackUsingArray(5);

        while (true) {
            System.out.println("\n*****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Display");
            System.out.println("5: Check if Empty");
            System.out.println("6: Check if Full");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting.....");
                    System.exit(0);
                case 1:
                    System.out.print("Enter element to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1)
                        System.out.println("Popped: " + popped);
                    break;
                case 3:
                    int topVal = stack.peek();
                    if (topVal != -1)
                        System.out.println("Top element: " + topVal);
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Stack is " + (stack.isEmpty() ? "empty" : "not empty"));
                    break;
                case 6:
                    System.out.println("Stack is " + (stack.isFull() ? "full" : "not full"));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
