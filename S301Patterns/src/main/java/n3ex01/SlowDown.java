package n3ex01;

import vehicles.Vehicle;

public class SlowDown implements Command {
	
    private Vehicle vehicle;

    public SlowDown(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {

        vehicle.startUp();
    }
}