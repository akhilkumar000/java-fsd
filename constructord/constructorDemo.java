package constructord;

class EmpInformation{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class constructorDemo {

public static void main(String[] args) {

	EmpInformation emp1=new EmpInformation();
	EmpInformation emp2=new EmpInformation();

	emp1.display();
	emp2.display();
	}
}
