import java.util.Scanner;
class Greatest
{
	public static void main(String args[]){
		int x,y,z;
		System.out.println("Enter three numbers:");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		if(x >y && x>z)
			System.out.println("X is greatest");
		else if(y>z)
		   System.out.println("Y is greatest");
		else
			System.out.println("Z is greatest");
	}
}