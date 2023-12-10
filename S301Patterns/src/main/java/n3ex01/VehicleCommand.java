package n3ex01;

public class VehicleCommand {
	
    private Command startUp;
    private Command speedUp;
    private Command slowDown;

    public void setStartUp(Command startUp) {
        this.startUp = startUp;
    }

    public void setSpeedUp(Command accelerate) {
        this.speedUp = accelerate;
    }

    public void setSlowDown(Command slowDown) {
        this.slowDown = slowDown;
    }

    public void executeStartUp (){
        startUp.execute();
    }

    public void executeSpeedUp (){
        speedUp.execute();
    }

    public void executeSlowDown (){
        slowDown.execute();
    }

}