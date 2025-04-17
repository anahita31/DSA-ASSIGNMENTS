package ASSIGNMENT3;
class Box<T> {
	T x;
	T y;
	Box(T x,T y) {
		this.x=x;
		this.y=y;
	}void show() {
		System.out.println(x+ " " + y);
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box<String>obj=new Box<String> ("Anahita","Shreya");
        obj.show();
        Box<Integer>obj1=new Box<Integer>(100,200);
        obj1.show();
        Box<Object>obj2=new Box<Object>("Anahita",200);
        obj2.show();
	}
}
