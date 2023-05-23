package day13.constructor;

class X{
	int a=10;
	X() {
		System.out.println("Running constructor X class");
	}
	void display() {
		System.out.println("I am display of X() class");
	}
}

class Y{
	int b=89;
	Y() {
		System.out.println("Running constructor Y class");
	}
	void display() {
		System.out.println("I am display of Y() class");
	}
}

public class Exa3 {
	void display() {
	System.out.println("Running constructor Exa3 class");
}

	public static void main(String[] args) {
		System.out.println("Program starts");
		
		X x = new X();
		x.display();
		System.out.println("******************************");
		Y y = new Y();
		y.display();
		System.out.println("******************************");
		Exa3 E1 = new Exa3();
		E1.display();
	}

}
