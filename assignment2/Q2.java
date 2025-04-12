package assignment2;
class complex{
	int real;
	int image;
	void setData(int real, int image) {
		this.real=real;
		this.image=image;
	}void display(){
		System.out.println(real+"+"+image+"i");	
	}public complex add(complex obj1,complex obj2) {
		real=obj1.real+obj2.real;
		image=obj1.image+obj2.image;
		return this;
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex obj1=new complex();
		obj1.setData(2, 3);
		complex obj2=new complex();
		obj2.setData(3, 2);
		obj1.display();
		obj2.display();
		complex obj3=new complex();
		obj3=obj3.add(obj1, obj2);
		obj3.display();
	}

}
