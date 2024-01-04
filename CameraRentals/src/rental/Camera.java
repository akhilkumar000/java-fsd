package rental;

public class Camera {
	private int cameraId;
	private String brand;
	private String model;
	private double price;
	private String status;
	
	
	
	
	
	public int getCameraId() {
		return cameraId;
	}
	public void setCameraId(int cameraId) {
		this.cameraId = cameraId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Camera(int cameraId, String brand, String model, double price, String status) {
		super();
		this.cameraId = cameraId;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = status;
	}
	@Override
	public String toString() {
		return "camera [cameraId=" + cameraId + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", status=" + status + "]";
	}
	
	
	
	
}
