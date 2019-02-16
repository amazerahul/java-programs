class cube
{
	int length,breadth,height;
	cube(){
		length=10;
		breadth=10;
		height=10;
	}
	cube(int l,int b,int h){
		length = l;
		breadth = b;
		height = h;
	}
	int getVolume(){
		return(length*breadth*height);
	}
	public static void main(String[] args){
		cube c1 = new cube();
		cube c2 = new cube(10,20,30);
		System.out.println("volume of cube is = " + c1.getVolume());
		System.out.println("volume of cube is = " + c2.getVolume());
	}
}