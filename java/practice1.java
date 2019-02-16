import java.util.Scanner;
class Student{
	public static void main(String[] args){
		int x,y,total=0,j=0;
		float percent=0;
		int i;
		System.out.println("Enter the number of subjects");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		int[] marks = new int[x];
		for(i=0;i<x;i++){
			y = in.nextInt();
			marks[i] = y;
			total = total + y;
			j = j+i;
		}
		percent = ((total/i)*100);
 System.out.println("percentage is:"+percent);
	}
}