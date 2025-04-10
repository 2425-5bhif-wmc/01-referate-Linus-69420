package at.htl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Car {
    public String brand;
    public String model;
    public int manufactureYear;
    public String color;
    public String vin;
    @ManyToOne
    @JoinColumn(name = "engine_id") // no "unique = true"
    private Engine engine;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Car() {}

    public Car(String brand, String model, int year, String color, String vin, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.manufactureYear = year;
        this.color = color;
        this.vin = vin;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int year) {
        this.manufactureYear = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}