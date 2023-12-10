package vehicles;

public class Car extends Vehicle {

	private final String NAME = "Car";

	@Override
	public void startUp() {

		System.out.println(NAME+" it's start speeding up!!!");

	}

	@Override
	public void speedUp() {

		System.out.println(NAME+" it's getting speed up");

	}

	@Override
	public void slowDown() {

		System.out.println(NAME+" it's slowing down!");

	}
}
