package day6.globalvariable;

public class StaticGlobalVariableEx4 {
	//static global  variables
			static int age=25;
			static boolean res;
			static char grade='B';
			static float roi;
	public static void main(String[] args) {
		
			System.out.println("Program starts");
			//we can access static global variables using classname from here as main() is also static
			System.out.println("value of age is: "+StaticGlobalVariableEx4.age);
			System.out.println("default value of res is: "+StaticGlobalVariableEx4.res);
			System.out.println("value of grade is: "+StaticGlobalVariableEx4.grade);
			System.out.println("default value of roi is: "+StaticGlobalVariableEx4.roi);
			System.out.println("**********************************");
			//initialization of static global variable
			age=35;
			res=true;
			grade='A';
			roi=6.5f;
			System.out.println("updated value of age is: "+StaticGlobalVariableEx4.age);
			System.out.println("updated value of res is: "+StaticGlobalVariableEx4.res);
			System.out.println("updated value of grade is: "+StaticGlobalVariableEx4.grade);
			System.out.println("updated value of roi is: "+StaticGlobalVariableEx4.roi);
			System.out.println("Program ends");

	}

}
