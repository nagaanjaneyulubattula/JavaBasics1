package Loops;
import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num=Scan.nextInt();
		int i=1;
		System.out.println("Multiplication of "+ num);
		while(i<=10)
		{
			System.out.println(num + " * " + i +" = "+ (num*i));
			i++;
		}
	}

}
