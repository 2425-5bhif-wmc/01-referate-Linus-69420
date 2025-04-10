package at.htl.boundary;
import at.htl.controller.CarRepository;
import at.htl.controller.EngineRepository;
import at.htl.entity.Car;
import at.htl.entity.Engine;
import org.eclipse.microprofile.graphql.*;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;

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
        return carRepository.getAll();
    }

    @Mutation
    public Car addCar(
            @Name("brand") String brand,
            @Name("model") String model,
            @Name("year") int year,
            @Name("engine") Engine engine
    ) {
        engineRepository.add(engine);
        Car car = new Car(brand, model, year, engine);
        carRepository.add(car);
        return car;
    }
}
