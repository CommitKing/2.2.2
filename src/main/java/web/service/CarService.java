package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = List.of(
                new Car("Toyota", 2020, "Camry"),
                new Car("Honda", 2019, "Accord"),
                new Car("Ford", 2021, "Focus"),
                new Car("BMW", 2018, "X5"),
                new Car("Audi", 2019, "A6")
        );
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return count <= 0 ? cars.subList(0, 0) : cars.subList(0, count);
    }
}
