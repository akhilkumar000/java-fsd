package rental;

import java.util.List;

public class View {

	public void viewAllCameras(List<Camera> cameraList) {
		System.out.println("==================================================================");
		System.out.println("cameraId"+"\t"+"brand"+"\t"+"model"+"\t"+"price"+"\t"+"status");
		System.out.println("==================================================================");
		for (Camera s:cameraList) {
			System.out.println(s.getCameraId() + "\t" + s.getBrand() + "\t" + s.getModel() + "\t" + s.getPrice()+"\t"+s.getStatus());
		}
		
	}
	
}
