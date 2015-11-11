import java.util.Scanner;
import vehicle.Car;


public class Driving {

    public static void main(String[] args) {
         
		Scanner in = new Scanner(System.in);
		Car myCar = new Car();
		String make;
		String model;
		
		System.out.println("Starting your car.....");
		myCar.turnOn();
		
		
		while ( myCar.isRun() ) {
		System.out.println("=====================================");
		System.out.println("VROOM...your car is running:");
		System.out.println("You drive a " + myCar.getMake() );
		System.out.println("    of type" + myCar.getModel() );
		System.out.println("=====================================");
		System.out.println("What do you want to do with your vehicle?");
		System.out.println("   0 - Turn car  off?");
		System.out.println("   1 - Change make of car");
		System.out.println("   2 - Change model of car");
		
		int answer = in.nextInt();
		//Menu System 
		if(answer == 0)
		{
			
		myCar.turnOff(); 
			
		}else if (answer == 1){
			System.out.println("New Make of car?");
			make = in.next();
			myCar.setMake(make);
			
		}else if (answer == 2){
			System.out.println("New Model of car?");
			model = in.next();
			myCar.setModel(model);
		}
		
	}

    }
}