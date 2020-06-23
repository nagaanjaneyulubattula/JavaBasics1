package Loops;
import java.util.Scanner;
public class forloop {
public static void loop1()
{
	@SuppressWarnings("resource")
	Scanner Scan=new Scanner(System.in);
	System.out.print("Enter The Number : ");
	int num=Scan.nextInt();
	System.out.println("Multiplication of "+ num);
	for(int i=1;i<=10;i++)
	{
		System.out.println(num + " * " + i +" = "+ (num*i));
	}
}

public static void loop2()
{
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop1();
		System.out.println("===============================");
		loop2();
	}

}
