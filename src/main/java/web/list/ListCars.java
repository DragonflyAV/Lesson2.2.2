package web.list;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListCars {

    private static List<Car> cars;

    public static List<Car> index() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Lada", 135));
        cars.add(new Car(2, "Mercedes", 238));
        cars.add(new Car(3, "Volkswagen", 376));
        cars.add(new Car(4, "Honda", 489));
        cars.add(new Car(5, "Subaru", 521));
        return cars;
    }

}
