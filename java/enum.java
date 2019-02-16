import java.util.*;
enum Items{Burger , Noodles , Pizza}
class TestEnum{
	static Items ob;
	public static void main(String...rk){
		Scanner in= new Scanner(System.in);
		for(Items i : Items.values())
			System.out.println(i);
		System.out.println("\nEnter the items you want to order:\t");
		String itm = in.next();
		ob= Items.valueOf(itm);
		switch(ob){
			case Burger:System.out.println("BURGER ORDERED");break;
			case Noodles:System.out.println("NOODLES ORDERED");break;
			case Pizza:System.out.println("PIZZA ORDERED");break;
		}
	}
}