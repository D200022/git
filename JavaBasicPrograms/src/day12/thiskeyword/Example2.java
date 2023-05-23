package day12.thiskeyword;

public class Example2 {
	int x=20, y=55;
	void display(int x) {
		System.out.println("Local variable x is: "+x);
		System.out.println("Non-static global variable y is: "+y);
		System.out.println("Non-static global variable x is: "+this.x);
	}
	

	public static void main(String[] args) {
		Example2 E2 = new Example2();
		E2.display(10);
		System.out.println("x is: "+E2.x);
		System.out.println("y is: "+E2.y);
	}

}
