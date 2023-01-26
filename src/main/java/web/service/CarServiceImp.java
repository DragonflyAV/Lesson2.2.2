package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "Lada", 135));
        cars.add(new Car(2, "Mercedes", 238));
        cars.add(new Car(3, "Volkswagen", 376));
        cars.add(new Car(4, "Honda", 489));
        cars.add(new Car(5, "Subaru", 521));
    }

    public List<Car> listCarCount(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
