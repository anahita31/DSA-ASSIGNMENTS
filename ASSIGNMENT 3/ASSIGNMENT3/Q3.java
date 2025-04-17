package ASSIGNMENT3;
class MarksOutOfBoundException extends Exception {
	MarksOutOfBoundException(String msg) {
		super(msg);
	}
	}
class student {
	String name;
	int marks;
	void DataEntry (String name , int mark) {
		this.name =name;
		this.marks = marks;
		if(mark>100) {
			try {
				throw new MarksOutOfBoundException("Mark is greater than 100");
			}catch(MarksOutOfBoundException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println(name+ " "+marks);
		}
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student obj =new student();
        obj.DataEntry("Anahita",180);
	}

}
