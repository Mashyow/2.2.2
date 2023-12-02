package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Mercedes", "Maybach", 100));
        cars.add(new Car("BMW", "G30", 130));
        cars.add(new Car("Audi", "80", 880));
        cars.add(new Car("Skoda", "Octavia", 878));
        cars.add(new Car("Ford", "FoсusRS", 676));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(Math.max(count, 0)).toList();
    }
}