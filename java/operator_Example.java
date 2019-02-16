class OperatorExampleShift{
	public static void main(String args[]){
		System.out.println("----------left shift operator-----------");
		//int b=10;
		//int c=b<<2;
		System.out.println(10<<2);//10*2^2=10*4=40
		System.out.println(-10<<3);//-10*2^3=10*4=-80
		System.out.println(20<<2);//20*2^2=10*4=80
		System.out.println(-15<<4);//15*2^4=10*4=-240
		System.out.println("----------right shift operator-----------");

		System.out.println(10>>2);//10/2^2=10/4=2
		System.out.println(20>>2);//-20/2^2=20/4=5
		System.out.println(-20>>3);//10/2^3=20/8=2

		System.out.println("---------->> vs >>>-----------");

		System.out.println(20>>2);
		System.out.println(20>>>2);

		System.out.println(-1>>>24);
		int b=-2;

		System.out.println(Integer.toBinaryString(b));
		int c = b>>>16;
		System.out.println(Integer.toBinaryString(c));

		int g=-53;
		System.out.println(Integer.toBinaryString(g));

		int h=~g;
		System.out.println(Integer.toBinaryString(h));


	}
}