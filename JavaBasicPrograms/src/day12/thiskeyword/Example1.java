package day12.thiskeyword;

public class Example1 {
	int x=20, y=30;
	void calling(int x) {
		System.out.println("Local variable is: "+x);
		System.out.println("Non-static Local variable is: "+x);
		System.out.println("Non-static Local variable is: "+this.x);
		this.display();
		}
	void display() {
		System.out.println("**************************");
		System.out.println("Local variable x is: "+x);
		System.out.println("Local variable y is: "+y);
	}

	public static void main(String[] args) {
		
		Example1 E1 = new Example1();
		E1.calling(10);
		
		Example1.print();
	}
		
		static void print() {
			System.out.println("program end");
		}


}
