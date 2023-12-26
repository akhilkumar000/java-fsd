package Methods;

public class callMethod {
	int val=150;
	int operation(int val) {
		val=val*10/100;
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callMethod ob =new callMethod();
		System.out.println("Before call operation "+ob.val);
		ob.operation(100);
		System.out.println("After call operation "+ob.val);
		
	}

}
