package day13.constructor;

class A {
	int i;
	A(int j) {
		System.out.println("Running Constructor A() class");
		i=j;
	}
}

public class Exa4 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		A a = new A(12);
		System.out.println("Class A global varibale i = "+a.i);
		a.i = 58;
		System.out.println("Class A global varibale i = "+a.i);
		
		A a1 = new A(74);
		System.out.println("Class A global varibale i = "+a1.i);
	}

}
