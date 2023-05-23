package day12.thiskeyword;

public class Example4 {
	int age;
	void call() {
		System.out.println("call method calling");
	}
	void m(int age) {
		System.out.println("Local age: "+age);
		System.out.println("Global age: "+this.age);
		
		this.call();
		System.out.println("this keyword value is: "+this);
	}

	public static void main(String[] args) {
		Example4 E4 = new Example4();
		E4.m(45);

	}

}
