package day6.globalvariable;

public class StaticGlobalVariableEx5 {
	static int num1, num2=25,res; 
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("Number1 is :"+num1);
		System.out.println("Number2 is :"+num2);
		res=num1+num2;
		System.out.println("Result is :"+res);
		System.out.println("*****************");
		
		num1 = 65;
		System.out.println("updated Number1 is :"+num1);
		System.out.println("Number2 is :"+num2);
		res=num1+num2;
		System.out.println("updated result is :"+res);
		System.out.println("*********************");
		
		num1=50;
		num2=55;
		System.out.println("updated number1 is :"+num1);
		System.out.println("updated number2 is :"+num2);
		res=num1+num2;
		System.out.println("updated result is :"+res);
		System.out.println("Program ends");
	}

}

