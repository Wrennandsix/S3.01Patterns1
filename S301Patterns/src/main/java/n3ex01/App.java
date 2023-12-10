package n3ex01;

import vehicles.Boat;
import vehicles.Bycicle;
import vehicles.Car;
import vehicles.Plane;

public class App {
	public static void main(String[] args) {
		
	
	VehicleCommand command = new VehicleCommand();
	
	Plane plane = new Plane();
    command.setStartUp(new StartUp(plane));
    command.setSpeedUp(new SpeedUp(plane));
    command.setSlowDown(new SlowDown(plane));
    command.executeStartUp();
    command.executeSpeedUp();
    command.executeSlowDown();
    System.out.println("");
    
	Car car = new Car();
    command.setStartUp(new StartUp(car));
    command.setSpeedUp(new SpeedUp(car));
    command.setSlowDown(new SlowDown(car));
    command.executeStartUp();
    command.executeSpeedUp();
    command.executeSlowDown();
    System.out.println("");
    
    Boat boat = new Boat();
    command.setStartUp(new StartUp(boat));
    command.setSpeedUp(new SpeedUp(boat));
    command.setSlowDown(new SlowDown(boat));
    command.executeStartUp();
    command.executeSpeedUp();
    command.executeSlowDown();
    System.out.println("");
    
    Bycicle bycicle = new Bycicle();
    command.setStartUp(new StartUp(bycicle));
    command.setSpeedUp(new SpeedUp(bycicle));
    command.setSlowDown(new SlowDown(bycicle));
    command.executeStartUp();
    command.executeSpeedUp();
    command.executeSlowDown();
}
}

