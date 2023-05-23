package day11.methods;

public class Example2 {

	void addnum(int a, int b, int c) {
		int res = a+b+c;
		System.out.println("***Addition***");
		System.out.println("Number1 is : "+a);
		System.out.println("Number2 is : "+b);
		System.out.println("Number3 is : "+c);
		System.out.println("Result is : "+res);
	}
	static void subnum() {
		int a=56, b=23, res;
		res = a-b;
		System.out.println("***Substraction***");
		System.out.println("Number4 is : "+a);
		System.out.println("Number5 is : "+b);
		System.out.println("Result is : "+res);
	}
	
	public static void divnum(int x, int y) {
		int res= x/y;
		System.out.println("***Division***");
		System.out.println("Number6 is : "+x);
		System.out.println("Number7 is : "+y);
		System.out.println("Result is : "+res);
	}
	
	public static void main(String[] args) {
		Example2 Ex = new Example2();
		Ex.addnum(10, 40, 56);
		System.out.println("------------------------------");
		Ex.addnum(22, 33, 22);
		System.out.println("***************************");
		subnum();
		System.out.println("***************************");
		divnum(100, 2);
		System.out.println("------------------------------");
		divnum(45, 5);
		System.out.println("***************************");

	}

}
