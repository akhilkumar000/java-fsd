package rental;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MyCamera {
	Scanner sc=new Scanner(System.in);
	

	public void addCamera(List<Camera> cameraList) {

		int length = cameraList.size();

		System.out.println("ENTER THE BRAND ");
		String brand = sc.next();
		System.out.println("ENTER THE MODEL");
		String model = sc.next();
		System.out.println("ENTER THE PER DAY PRICE(INR)");
		double price = sc.nextDouble();
		Camera details = new Camera(length + 1, brand, model, price, "Available");
		cameraList.add(details);
		System.out.println("YOUR CAMERA HAS BEEN ADDED SUCCESSFULLY TO LIST");

	}  
	

	
	public void removeCamera(List<Camera> cameraList) {
		System.out.println("==================================================================");
		System.out.println("cameraId"+"\t"+"brand"+"\t"+"model"+"\t"+"price"+"\t"+"status");
		System.out.println("==================================================================");
		
		for (Camera s:cameraList) {
			System.out.println(s.getCameraId() + "\t" + s.getBrand() + "\t" + s.getModel() + "\t" + s.getPrice()+"\t"+s.getStatus());
		}
		
		System.out.println("ENTER THE CAMERA ID TO BE REMOVED");
		int idToRemove=sc.nextInt();
		boolean chk=false;
		for (Camera s:cameraList) {
			if(s.getCameraId()==idToRemove) {
				cameraList.remove(s);
				chk=true;
				break;
			}
			
		}
		System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST");
		
	}



	public void viewAllCameras(List<Camera> cameraList) {
		for (Camera s:cameraList) {
			System.out.println(s.getCameraId() + "\t" + s.getBrand() + "\t" + s.getModel() + "\t" + s.getPrice()+"\t"+s.getStatus());
		}
		
	}
	
	
}
