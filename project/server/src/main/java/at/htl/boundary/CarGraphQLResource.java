package at.htl.boundary;

import at.htl.controller.CarRepository;
import at.htl.controller.EngineRepository;
import at.htl.entity.Car;
import at.htl.entity.Engine;

import org.eclipse.microprofile.graphql.*;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@GraphQLApi
@ApplicationScoped
public class CarGraphQLResource {

    @Inject
    CarRepository carRepository;

    @Inject
    EngineRepository engineRepository;

    @Query("cars")
    public List<Car> getCars() {
        return carRepository.listAll();
    }

    @Mutation
    @Transactional
    public Car addCar(
            @Name("brand") String brand,
            @Name("model") String model,
            @Name("year") int year,
            @Name("color") String color,
            @Name("vin") String vin,
            @Name("engine") Engine engine
    ) {
        engineRepository.persist(engine);
        Car car = new Car(brand, model, year, color, vin, engine);
        carRepository.persist(car);
        return car;
    }

    @Mutation
    @Transactional
    public Car updateCar(
            @Name("id") Long id,
            @Name("brand") String brand,
            @Name("model") String model,
            @Name("year") int year,
            @Name("color") String color,
            @Name("vin") String vin
    ) {
        Car car = carRepository.findById(id);
        if (car == null) {
            throw new RuntimeException("Car with ID " + id + " not found.");
        }

        car.setBrand(brand);
        car.setModel(model);
        car.setYear(year);
        car.setColor(color);
        car.setVin(vin);

        return car;
    }

    @Mutation
    @Transactional
    public boolean deleteCar(@Name("id") Long id) {
        Car car = carRepository.findById(id);
        if (car == null) {
            return false;
        }

        carRepository.delete(car);
        return true;
    }
}
