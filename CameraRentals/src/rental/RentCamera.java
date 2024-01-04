package rental;

import java.util.List;
import java.util.Scanner;

public class RentCamera {
	Scanner sc=new Scanner(System.in);
	
	
	public void DisplayALLCameras(List<Camera> cameraList, Wallet account) {
		
		System.out.println("Following are the list of Camera's");
		System.out.println("==================================================================");
		System.out.println("cameraId"+"\t"+"brand"+"\t"+"model"+"\t"+"price"+"\t"+"status");
		System.out.println("==================================================================");
		for (Camera s:cameraList) {
			System.out.println(s.getCameraId() + "\t" + s.getBrand() + "\t" + s.getModel() + "\t" + s.getPrice()+"\t"+s.getStatus());
		}
		System.out.println("ENTER THE CAMERA ID YOU WANT TO RENT");
		int selectCam=sc.nextInt();
		for (Camera s:cameraList) {
			if(s.getCameraId()==selectCam) {
				if(s.getPrice()<account.getWalletamt()) {
					System.out.println("YOUR TRANSACTION FOR CAMERS "+s.getBrand()+ " "+s.getModel()+" with rent INR"+s.getPrice()+".HAS SUCCESSFULLY COMPLETED");
					s.setStatus("Rented");
					account.setWalletamt(account.getWalletamt()-s.getPrice());
					System.out.println(s.getStatus());
				}
				else {
					System.out.println("TRANSACTION FAILED DUE TO INSUFFICIANT BALANCE. PLEASE DEPOSIT THE AMOUNT TO YOUR WALLET");
				}
			}
		}
		Main.startOver(cameraList,account);
	}
	

}
