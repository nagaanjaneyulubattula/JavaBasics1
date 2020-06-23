package Loops;

public class break_continue {
	public static void breakstatement()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				break;
			}
			System.out.println(i);
		}
	}
	public static void continuestatement()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				continue;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Break statement ");
		breakstatement();
		System.out.println("========================");
		System.out.println("Continue statement ");
		continuestatement();

	}

}
