package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String presentCars(@RequestParam(value = "count", required = false) Integer carCount, Model model) {
        List<Car> cars = carService.getCars(carCount);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
