package n3ex01;

import vehicles.Vehicle;

public class StartUp implements Command {
	
    private Vehicle vehicle;

    public StartUp(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {

        vehicle.startUp();
    }
}

