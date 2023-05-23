package day6.globalvariable;

public class StaticGlobalVariableEx3 {
	static int age;
	static boolean res;
	static char grade;
	static float roi;
	public static void main(String[] args) {
		System.out.println("Program starts");
		//we can access static global variables using classname from here as main() is also static
		System.out.println("default value of age is: "+StaticGlobalVariableEx3.age);
		System.out.println("default value of res is: "+StaticGlobalVariableEx3.res);
		System.out.println("default value of grade is: "+StaticGlobalVariableEx3.grade);
		System.out.println("default value of roi is: "+StaticGlobalVariableEx3.roi);
		System.out.println("**********************************");
		
		//initialization of static global variable
		StaticGlobalVariableEx3.age = 25;
		StaticGlobalVariableEx3.res = true;
		StaticGlobalVariableEx3.grade = 'A';
		StaticGlobalVariableEx3.roi = 6.5f;
		
		System.out.println("updated value of age is: "+StaticGlobalVariableEx3.age);
		System.out.println("updated value of res is: "+StaticGlobalVariableEx3.res);
		System.out.println("updated value of grade is: "+StaticGlobalVariableEx3.grade);
		System.out.println("updated value of roi is: "+StaticGlobalVariableEx3.roi);
		System.out.println("Program ends");

	}

}
