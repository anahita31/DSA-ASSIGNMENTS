package ASSIGNMENT2;
class complex {
	int real;
	int imag;
	void setData(int real , int imag) {
		this.real=real;
		this.imag=imag;
	}
	void display() {
		System.out.println(real + " " + imag + " ");
	}
	public complex add (complex obj1 , complex obj2) {
		real = obj1.real + obj2.real;
		imag = obj2.imag + obj2.imag;
		return this;
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        complex obj1 = new complex();
        obj1.setData(2, 3);
        complex obj2 = new complex();
        obj2.setData(3, 2);
        obj1.display();
        obj2.display();
        complex obj3 = new complex();
        obj3 = obj3.add(obj1, obj2);
        obj3.display();
	}

}
