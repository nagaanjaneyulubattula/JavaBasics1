package JavaBasics1;

public class typecasting {


	public static void Widenig_Casting() {
		System.out.println("Widenig Casting : byte->short->int->long->float->double");
		int i=100;
		long l=i;
		float f=l;
		System.out.println("Int value : "+i);
		System.out.println("long value : "+l);
		System.out.println("float value : "+f);
	}

	public static void Narrowing_Casting() {
		System.out.println("Narrowing  Casting : double->float->long->int->short->byte");
		double d=24.24;
		long l=(long)d;
		int i=(int)l;
		System.out.println("Double value : "+d);
		System.out.println("long value : "+l);
		System.out.println("Int value : "+i);
	}


	public static void doubleintobyte() {
		byte b;
		double d=234.34;
		int i=343;
		b=(byte)i;
		b = (byte) i; 
		System.out.println("Conversion of int to byte: i = " + i + " b = " + b);  
		b = (byte) d;        
		System.out.println("Conversion of double to byte: d = " + d + " b= " + b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Widenig_Casting();
		System.out.println("============================");
		Narrowing_Casting();
		System.out.println("============================");
		doubleintobyte();
	}

}
