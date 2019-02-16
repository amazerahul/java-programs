class CmdTwoInput{
	public static void main(String[] args){
		double a,b,c;
		System.out.println("length is:"+args.length);
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);}
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c=a+b;
			System.out.println("Sum of these two numbers is:"+c);
		
	}
}