import java.util.Scanner;


public class main {

	public static void main(String[] args) {
	
		//System.out.println(maths(1, 2, "add"));
		//System.out.println(maths(1, 2, "subtract"));
		//System.out.println(maths(1, 2, "divide"));
		//System.out.println(maths(1, 2, "multiply"));
		System.out.println(divide(4,2));
		run();
	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static float divide(float a, float b) {
		return a / b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static float maths(int a, int b, String c) {
		if (c.equals("add")){
			return add(a, b);
			
		} else if(c.equals("sub")) {
			return subtract(a, b);
		}else if(c.equals("divide")) {
			return divide(a, b);
			
		}else return multiply(a, b);
		
	}
	public static float run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number");
		int num1;
		num1 = scan.nextInt();
		
		System.out.println("enter second number");
		int num2;
		num2 = scan.nextInt();
		
		
	System.out.println("enter add subtract divide or multiply");
	String maths;
	maths = scan.next();
	
	while (!(maths.equals("add") || maths.equals("subtract") ||  maths.equals("divide") || maths.equals("multiply"))) {
		System.out.println("error enter expression");
		maths = scan.next();
	}
	
	System.out.println(maths(num1, num2, maths));
	return maths(num1, num2, maths);
			
	}
	
	
}
