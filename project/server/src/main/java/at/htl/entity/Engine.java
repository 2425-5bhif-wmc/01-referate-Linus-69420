package at.htl.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Entity
public class Engine{

    public int power; // in HP

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FuelType fuelType;

    public int cylinders;

    public double displacement;
    public boolean turbocharged;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Engine() {}

    public Engine( int power, FuelType fuelType, int cylinders, double displacement, boolean turbocharged) {
        this.power = power;
        this.fuelType = fuelType;
        this.cylinders = cylinders;
        this.displacement = displacement;
        this.turbocharged = turbocharged;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public boolean isTurbocharged() {
        return turbocharged;
    }

    public void setTurbocharged(boolean turbocharged) {
        this.turbocharged = turbocharged;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}