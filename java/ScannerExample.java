import java.util.Scanner;
import java.lang.String;
class ScannerExample{
	public static void main(String[] args){
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		boolean bo;
		String c;
		String s1;
		char c1;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a String");
		s1 = in.nextLine();
		System.out.println("String:" +s1);

		System.out.println("Enter a byte");
		b = in.nextByte();
		System.out.println("Byte:" +b);

		System.out.println("Enter a Short");
		s = in.nextShort();
		System.out.println("Short:" +s);

		System.out.println("Enter a Integer");
		i = in.nextInt();
		System.out.println("Integer:" +i);

		System.out.println("Enter a Long");
		l = in.nextLong();
		System.out.println("Long:" +l);

		System.out.println("Enter a float");
		f = in.nextFloat();
		System.out.println("float:" +f);

		System.out.println("Enter a Double");
		d = in.nextDouble();
		System.out.println("Double:" +d);

		System.out.println("Enter a boolean");
		bo = in.nextBoolean();
		System.out.println("Boolean:" +bo);

		System.out.println("Enter a Word");
		c = in.next();
		System.out.println("Word:" +c);

		System.out.println("Print a Character");
		c1 = c.charAt(0);
		//c1= in.next().charAt(1);//charAt(index) is a method present  in java.lang.String
		System.out.println("Character:" +c1);

	}
}