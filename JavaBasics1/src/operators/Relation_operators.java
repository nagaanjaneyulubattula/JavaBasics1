package operators;
import java.util.Scanner;
public class Relation_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter The Value of a : ");
		int a=Scan.nextInt();
		System.out.print("Enter The Value of b : ");
		int b=Scan.nextInt();
		System.out.println("a==b : "+(a==b));
		System.out.println("a!=b : "+(a!=b));
		System.out.println("a>b : "+(a>b));
		System.out.println("a<b : "+(a<b));
		System.out.println("a>=b : "+(a>=b));
		System.out.println("a<=b : "+(a<=b));
	}

}
