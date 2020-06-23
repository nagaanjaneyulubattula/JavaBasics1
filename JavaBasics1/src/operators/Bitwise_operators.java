package operators;
import java.util.Scanner;
public class Bitwise_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter The Value of a : ");
		int a=Scan.nextInt();
		System.out.print("Enter The Value of b : ");
		int b=Scan.nextInt();
		int result=0;
		
		result=a&b;
		System.out.println("a&b : "+result);
		
		result=a|b;
		System.out.println("a|b : "+result);
		
		result=a^b;
		System.out.println("a^b : "+result);
		
		result=~a;
		System.out.println("~a : "+result);
		
	}

}
