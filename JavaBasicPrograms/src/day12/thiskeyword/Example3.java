package day12.thiskeyword;

	class A{
		void m() {
			System.out.println("hello m");
		}
		void n() {
			System.out.println("hello n");
			m();
		}
	}
	class B{
		void method1() {
			System.out.println("hello method1");
		}
		void method2() {
			System.out.println("hello method2");
			method1();
		}

	public static void main(String[] args) {
		B b = new B();
		b.method2();
		A a = new A();
		a.n();
	}
}
