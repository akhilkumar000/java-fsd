package module_2;
class defAccessModifier {
	void display() {
		System.out.println("Using this Default access specifier");	
		}
}
public class acessModifier {

	public static void main(String[] args) {
		 System.out.println("Default access Specifier");
		 defAccessModifier obj=new defAccessModifier();
		 obj.display();
	}

}
