package two;

public class Motorbike extends Vehicle {
    private int speedLimit;

    public Motorbike(String name, int year, int speedLimit) {
        super(name, year);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

}
