package ASSIGNMENT4;

import java.util.Scanner;

class Node {
	 protected int regd_no;
	 protected float mark;
	 protected Node  next;
	 public Node(int reg_no , float mark) {
		 this.regd_no = regd_no;
		 this.mark = mark;
		 this.next = null;
	 }
}
public class LinkedList {
	static Scanner sc = new Scanner(System.in);
	public static Node create(Node start) {
		System.out.println("Entr regd_no:");
		int regd_no = sc.nextInt();
		System.out.println("Enter mark:");
		float mark = sc.nextFloat();
		Node newNode = new Node(regd_no, mark);
		newNode.next = start;
		return newNode;
	}
	public static void display(Node start) {
		if(start==null) {
			System.out.println("List Is Empty");
			return;
		}
		Node temp = start;
		while (temp != null) {
			System.out.println("Regd_no: " + temp.regd_no + ", Mark: " + temp.mark);
			temp = temp.next;
		}
	}
    public static Node InsBeg(Node start) {
    	return create(start);
    }
    
    public static Node InsEnd(Node start) {
    	  System.out.print("Enter regd_no: ");
          int regd_no = sc.nextInt();
          System.out.print("Enter mark: ");
          float mark = sc.nextFloat();
          Node newNode = new Node(regd_no, mark);
          if (start == null) return newNode;
          Node temp = start;
          while (temp.next != null) temp = temp.next;
          temp.next = newNode;
          return start;
      }

    	public static Node InsAny(Node start) {
    		System.out.print("Enter position to insert at: ");
            int pos = sc.nextInt();
            if (pos == 1) return InsBeg(start);
            System.out.print("Enter regd_no: ");
            int regd_no = sc.nextInt();
            System.out.print("Enter mark: ");
            float mark = sc.nextFloat();
            Node newNode = new Node(regd_no, mark);
            Node temp = start;
            for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
            if (temp == null) {
                System.out.println("Position out of bounds.");
                return start;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            return start;
        }

    	public static Node DelBeg(Node start) {
    		if (start == null)
    			return null;
    		return start.next;
    	}
    
    	public static Node DelEnd(Node start) {
    		if (start == null || start.next == null)
    			return null;
    		Node temp1 = start;
    		while (temp1.next.next != null)
    			temp1 = temp1.next;
    		temp1.next = null;
    		return start;
    	}
    
    	
    	public static Node DelAny(Node start) {
    		System.out.print("Enter position to delete: ");
            int pos = sc.nextInt();
            if (pos == 1) return DelBeg(start);
            Node temp = start;
            for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
            if (temp == null || temp.next == null) {
                System.out.println("Position out of bounds.");
                return start;
            }
            temp.next = temp.next.next;
            return start;
        }
    	
    	public static Node DelbyRegdNo(Node start) {
    		System.out.print("Enter regd_no to delete: ");
            int regd_no = sc.nextInt();
            if (start == null) return null;
            if (start.regd_no == regd_no) return start.next;
            Node temp = start;
            while (temp.next != null && temp.next.regd_no != regd_no) temp = temp.next;
            if (temp.next == null) {
                System.out.println("Node not found.");
                return start;
    	}
            temp.next = temp.next.next;
            return start;
    	}
    	
    	public static void search (Node start) {
    		System.out.print("Enter regd_no to search");
    		int regd_no = sc.nextInt();
    		Node temp = start;
    		while (temp != null) {
    			if (temp.regd_no == regd_no) {
    				System.out.print("Enter new mark: ");
    				temp.mark = sc.nextFloat();
    				return;
    			}
    			temp = temp.next;
    		}
    		System.out.println("Node not found");
    	}
    	
    	public static void sort(Node start) {
    		for (Node i = start; i != null; i = i.next) {
    			for (Node j = i.next; j != null; j = j.next) {
    				if (i.mark < j.mark) {
    				    float tmpMark = i.mark;
    				int tmpRegd = i.regd_no;
    				i.mark = j.mark;
    				i.regd_no = j.regd_no;
    				j.mark = tmpMark;
    				j.regd_no = tmpRegd;
    			}
    		}
    	}
}

public static int count(Node start) {
	int c = 0;
	while (start != null) {
		c++;
		start = start.next;
	}
	return c;
}

public static Node reverse(Node start) {
	Node prev = null, curr = start, next;
	while (curr != null) {
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
	}
	return prev;
}

public static void main(String[] args) {
	Node start = null;
	int choice ;
	while (true) {
		System.out.println("\n*****MENU*****");
		System.out.println("0: Exit");
        System.out.println("1: Creation");
        System.out.println("2: Display");
        System.out.println("3: Insert at Beginning");
        System.out.println("4: Insert at End");
        System.out.println("5: Insert at Any Position");
        System.out.println("6: Delete from Beginning");
        System.out.println("7: Delete from End");
        System.out.println("8: Delete from Any Position");
        System.out.println("9: Delete by regd_no");
        System.out.println("10: Search and Update Mark");
        System.out.println("11: Sort by Mark (Descending)");
        System.out.println("12: Count Nodes");
        System.out.println("13: Reverse List");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        
        switch (choice) {
        case 0: System.exit(0);
        case 1: start = create(start); 
        break;
        case 2: display(start);
        break;
        case 3: start = InsBeg(start);
        break;
        case 4: start = InsEnd(start); 
        break;
        case 5: start = InsAny(start); 
        break;
        case 6: start = DelBeg(start);
        break;
        case 7: start = DelEnd(start); 
        break;
        case 8: start = DelAny(start);
        break;
        case 9: start = DelbyRegdNo(start);
        break;
        case 10: search(start);
        break;
        case 11: sort(start); 
        break;
        case 12: System.out.println("Count: " + count(start));
        break;
        case 13: start = reverse(start); 
        break;
        default: System.out.println("Wrong choice.");
        }
	}
}
}


//output
*****MENU*****
0: Exit
1: Creation
2: Display
3: Insert at Beginning
4: Insert at End
5: Insert at Any Position
6: Delete from Beginning
7: Delete from End
8: Delete from Any Position
9: Delete by regd_no
10: Search and Update Mark
11: Sort by Mark (Descending)
12: Count Nodes
13: Reverse List
Enter your choice: 
