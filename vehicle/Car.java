package vehicle;

public class Car{
	
	private boolean isRunning;
	private String make = "No Make";
	private String model = "No Model";
	private int numOfWheels = 4; 
	
	public void setMake(String k){
		make = k;
	}
	
	public void setModel(String j){
		model = j;
	}
	public void Car(){
		isRunning = false;	
	}
	
	public void turnOn(){
		isRunning = true;
	}
	
	public void turnOff(){
		isRunning = false;
	}
	
	public boolean isRun(){
		return isRunning;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getMake(){
		return make;
	}
}