class Base{
	String name;
	//constructor
	Base(){
		this("");
		System.out.println("non-argument constructor of"+ "base class");
	}
	Base(String name)
	{
		this.name = name;
		System.out.println("Calling parameterized constructor"+ "of base");
	}
}
class Derived extends Base{
	//constructor 3
	Derived(){
		System.out.println("No-argument constructor" +  "of derived");
	}
	//parameterized constructor
	Derived(String name){
		//invokes base class constructor 2
		super(name);
		System.out.println("Calling prameterized" + "constructor of derived");
	}
	public static void main(String[] args){
		//calls parameterized constructor 4
		//Derived obj = new Derived("test");

		//Calls No-argument constructor
		Derived obj = new Derived();
	}
}