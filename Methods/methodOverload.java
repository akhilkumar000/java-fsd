package Methods;

public class methodOverload {
	public void area(int b,int h) {
		System.out.println("Area of Triangle "+(0.5*b*h));
	}
	public void area(int r) {
		System.out.println("Area of Circle "+(3.14*r*r));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverload ob =new methodOverload();
		ob.area(10,15);
		ob.area(20);
	}

}
