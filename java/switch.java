import java.util.Scanner;
import java.lang.String;
class abc{
	int c;
	int mul(int a,int b){
		c = a*b;
		return c;
	}
	int add(int a,int b){
		c = a+b;
		return c;
	}
	int sub(int a,int b){
		c = a-b;
		return c;
	}
	int div(int a,int b){
		c = a/b;
		return c;
	}
}
class SampleSwitch{
	public static void main(String args[]){
		int x,y,res;
		String z;
		System.out.println("Enter two values:");
		Scanner in = new Scanner(System.in);
		x =in.nextInt();
		y = in.nextInt();
		System.out.println("Enter your choice:");
		z = in.next();
		abc obj = new abc();
		switch(z){
			case "Mul":
			System.out.println(obj.mul(x,y));
			break;
			case "Add":
			System.out.println(obj.add(x,y));
			break;
			case "Sub":
			System.out.println(obj.sub(x,y));
			break;
			case "Div":
			System.out.println(obj.div(x,y));
			break;
			default:
			System.out.println("Enter valid option");
			

		}


	}
}
