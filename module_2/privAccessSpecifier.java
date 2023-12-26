package module_2;
class privAccess{
	private void display() {
		System.out.println("Using private Specifier");
	}
	
}
public class privAccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Private access Specifier");
		privAccess obj=new privAccess();
		obj.display();
		
	}

}
