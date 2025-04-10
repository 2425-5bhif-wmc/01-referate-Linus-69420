package at.htl.entity;

public class Engine {
    public int power; // in HP
    public String fuelType;
    public int cylinders;

    public Engine() {}

    public Engine(int power, String fuelType, int cylinders) {
        this.power = power;
        this.fuelType = fuelType;
        this.cylinders = cylinders;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}