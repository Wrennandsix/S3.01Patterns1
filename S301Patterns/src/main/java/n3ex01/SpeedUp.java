package n3ex01;

import vehicles.Vehicle;

public class SpeedUp implements Command {

    private Vehicle vehicle;

    public SpeedUp(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {

        vehicle.speedUp();

    }
}