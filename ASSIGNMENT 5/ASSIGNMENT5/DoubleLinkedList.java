package ASSIGNMENT5;
import java.util.Scanner;

public class DoubleLinkedList {
    public static class DLinkedList {
         static Scanner sc = new Scanner(System.in);

        
        static class Node {
            protected int regd_no;
            protected float mark;
            protected Node next;
            protected Node prev;

            Node(int regd_no, float mark) {
                this.regd_no = regd_no;
                this.mark = mark;
                this.next = null;
                this.prev = null;
            }
        }

        public static Node create(Node start, Node end) {
            System.out.print("Enter regd_no: ");
            int regd_no = sc.nextInt();
            System.out.print("Enter mark: ");
            float mark = sc.nextFloat();
            Node newNode = new Node(regd_no, mark);
            if (start == null) {
                start = end = newNode;
            } else {
                end.next = newNode;
                newNode.prev = end;
                end = newNode;
            }
            return end;
        }

        public static void display(Node start, Node end) {
            if (start == null) {
                System.out.println("List is empty.");
                return;
            }
            Node temp = start;
            System.out.println("List contents:");
            while (temp != null) {
                System.out.println("Regd No: " + temp.regd_no + ", Mark: " + temp.mark);
                temp = temp.next;
            }
        }

        public static Node insBeg(Node start, Node end) {
            System.out.print("Enter regd_no: ");
            int regd_no = sc.nextInt();
            System.out.print("Enter mark: ");
            float mark = sc.nextFloat();
            Node newNode = new Node(regd_no, mark);
            if (start == null) {
                return newNode;
            }
            newNode.next = start;
            start.prev = newNode;
            return newNode;
        }

        public static Node insEnd(Node start, Node end) {
            System.out.print("Enter regd_no: ");
            int regd_no = sc.nextInt();
            System.out.print("Enter mark: ");
            float mark = sc.nextFloat();
            Node newNode = new Node(regd_no, mark);
            if (end == null) {
                return newNode;
            }
            end.next = newNode;
            newNode.prev = end;
            return newNode;
        }

        public static Node insAny(Node start, Node end) {
            System.out.print("Enter position (starting from 1): ");
            int pos = sc.nextInt();
            System.out.print("Enter regd_no: ");
            int regd_no = sc.nextInt();
            System.out.print("Enter mark: ");
            float mark = sc.nextFloat();
            Node newNode = new Node(regd_no, mark);

            if (pos == 1 || start == null) {
                newNode.next = start;
                if (start != null)
                	start.prev = newNode;
                return newNode;
            }

            Node temp = start;
            for (int i = 1; i < pos - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            if (temp.next != null)
            	temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
            return start;
        }

        public static Node delBeg(Node start, Node end) {
            if (start == null) {
                System.out.println("List is empty.");
                return null;
            }
            Node temp = start.next;
            if (temp != null) 
            	temp.prev = null;
            return temp;
        }

        public static Node delEnd(Node start, Node end) {
            if (end == null) {
                System.out.println("List is empty.");
                return null;
            }
            if (end.prev != null) {
                end.prev.next = null;
                return end.prev;
            } else {
                return null;
            }
        }

        public static Node delAny(Node start, Node end) {
            System.out.print("Enter position to delete: ");
            int pos = sc.nextInt();
            if (start == null) {
                System.out.println("List is empty.");
                return null;
            }
            if (pos == 1) {
                return delBeg(start, end);
            }
            Node temp = start;
            for (int i = 1; i < pos && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid position.");
                return start;
            }
            if (temp.prev != null) 
            	temp.prev.next = temp.next;
            if (temp.next != null)
            	temp.next.prev = temp.prev;
            return start;
        }

        public static void search(Node start) {
            System.out.print("Enter regd_no to search: ");
            int regd_no = sc.nextInt();
            Node temp = start;
            while (temp != null) {
                if (temp.regd_no == regd_no) {
                    System.out.print("Enter new mark: ");
                    temp.mark = sc.nextFloat();
                    System.out.println("Mark updated.");
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Student not found.");
        }

        public static void main(String[] args) {
            Node start = null, end = null;

            while (true) {
                System.out.println("\n*****MENU*****");
                System.out.println("0: Exit");
                System.out.println("1: Creation");
                System.out.println("2: Display");
                System.out.println("3: Insert at Beginning");
                System.out.println("4: Insert at End");
                System.out.println("5: Insert at Position");
                System.out.println("6: Delete from Beginning");
                System.out.println("7: Delete from End");
                System.out.println("8: Delete from Position");
                System.out.println("9: Search and Update");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 0: System.exit(0);
                    case 1: end = create(start, end); 
                    if (start == null)
                    	start = end;
                    break;
                    case 2: display(start, end); 
                    break;
                    case 3: start = insBeg(start, end); 
                    break;
                    case 4: end = insEnd(start, end); 
                    if (start == null) 
                    	start = end;
                    break;
                    case 5: start = insAny(start, end);
                    break;
                    case 6: start = delBeg(start, end); 
                    break;
                    case 7: end = delEnd(start, end);
                    break;
                    case 8: start = delAny(start, end);
                    break;
                    case 9: search(start);
                    break;
                    default: System.out.println("Wrong choice");
                }
            }
        }
    }
}
