package rental;

import java.util.List;
import java.util.Scanner;

public class WalletOperations {
	
	public void operations(Wallet account, List<Camera> cameraList) {
		System.out.println("YOUR CURRENT WALLET BALANCE IS- INR "+ account.getWalletamt());
		System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET?(1.YES,2.NO)");
		Scanner sc=new Scanner(System.in);
		int option =sc.nextInt();
		if(option==1) { 
			System.out.println("ENTER THE AMOUNT (INR) -");
			int amountToBeAdded=sc.nextInt();
			account.setWalletamt(account.getWalletamt()+amountToBeAdded);
			System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT BALANCE -INR. "+account.getWalletamt());
		}
		else {
			Main.startOver(cameraList,account);
		}
	}

}
