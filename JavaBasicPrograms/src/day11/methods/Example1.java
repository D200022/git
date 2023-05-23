package day11.methods;

public class Example1 {
	public static void display() {
		System.out.println("Hii, Good morning");
	}
	
	static void addNum(int num1 , int num2) {
		int res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	}
	
	static void print(String name, char grade, int num) {
		System.out.println("My name is : "+name);
		System.out.println("Grade is : "+grade);
		System.out.println("Number is : "+num);
	}

	public static void main(String[] args) {
		display();
		addNum(10,50);
		addNum(56,54);
		//Example1.addNum(56,54);
		print("Krishna", 'A', 123456789);
		print("Ram", 'D', 456123987);

	}

}
