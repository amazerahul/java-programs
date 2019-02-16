class ConstructorChaining{
	//defult constructor
	ConstructorChaining()
	{
		System.out.println("default");
	}
	//parameterized constructor
	ConstructorChaining(int x){
		this();
		System.out.println(x);
	}
	//parameterized constructor 3
	ConstructorChaining(int x,int y){
		//invoke parameter constructor 2
		this(5);
		System.out.println(x * y);
	}
	public static void main(String args[]){
		//invoke parameterized constructor 3
		ConstructorChaining c1 = new ConstructorChaining(8,10);
	}
}