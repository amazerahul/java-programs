class abc{
	int c;
	int add(int a,int b){
		c = a+b;
		return c;
	}
}
class add_add{
	public static void main(String[] args){
		int z,j,k;		
		abc obj = new abc();
		 j = Integer.parseInt(args[0]);
		 k = Integer.parseInt(args[1]);
		z = obj.add(j,k);
		System.out.println("Sum of two number number is :"+z); 
	}
}