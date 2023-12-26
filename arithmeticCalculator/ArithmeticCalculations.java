package arithmeticCalculator;
import java.util.Scanner;
public class ArithmeticCalculations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		double num1=sc.nextDouble();
		System.out.println("Enter the Second Number");
		double num2=sc.nextDouble();
		
		char ob=sc.next().charAt(0);
		double result=0;
		switch(ob) {
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;
			default:
				System.out.println("Enter a valid number");
		}
		
		System.out.println("The Answer is "+result);
	}

}
