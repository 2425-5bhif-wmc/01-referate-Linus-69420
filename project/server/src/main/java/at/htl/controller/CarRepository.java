package at.htl.controller;

import at.htl.entity.Car;
import at.htl.entity.Engine;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarRepository {

    private List<Car> cars = new ArrayList<>();

    public CarRepository() {
        cars.add(new Car("Tesla", "Model S", 2022, new Engine(670, "Electric", 0)));
    }

    public List<Car> getAll() {
        return cars;
    }

    public void add(Car car) {
        cars.add(car);
    }
}