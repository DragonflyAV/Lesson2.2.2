package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.list.ListCars;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> listCar = new ArrayList<>();
        listCar = CarService.listCarCount(ListCars.index(), count);
        model.addAttribute("cars", listCar);
        return "cars";
    }

}
