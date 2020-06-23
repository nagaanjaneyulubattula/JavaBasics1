package static_initializer;
public class static_initializer {
	static
	{
		System.out.println("Welcome to JavaProgramming");
		System.out.println("This is static block Example");

	}
	public static void one()
	{
		System.out.println("Welcome to JavaProgramming");
		System.out.println("This is Initializer block Example");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		one();
		System.out.println("This is main method");
	}
}