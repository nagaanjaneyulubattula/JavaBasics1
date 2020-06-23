package operators;
import java.util.Scanner;
public class Arithmetic_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter The Value of a : ");
		int a=Scan.nextInt();
		System.out.print("Enter The Value of b : ");
		int b=Scan.nextInt();
		int c;
		c=a+b;
		System.out.println("Additon of two numbers : "+ c);

		c=a-b;
		System.out.println("Substraction of two numbers : "+ c);

		c=a*b;
		System.out.println("Multiplication of two numbers : "+ c);

		c=a/b;
		System.out.println("Division of two numbers : "+ c);

		c=a%b;
		System.out.println("Modulo Division of two numbers : "+ c);
		
		a=++a;
        System.out.println("Increment Operator: "+a);
        a=--a;
        System.out.println("decrement Operator: "+a);     
	}

}
