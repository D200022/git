package day13.constructor;

public class Example2 {
	int roll;
	double salary;
	Example2(int r, double s) {
		roll = r;
		salary = s;
	}
	void display() {
		System.out.println(roll+ " " +salary);
	}

	public static void main(String[] args) {
		Example2 E2 = new Example2(85, 125.654);
		E2.display();
		Example2 a2 = new Example2(20,145.69);
		a2.display();
	}

}
