package com.toni.programming.controller;

import com.toni.programming.data.Car;
import com.toni.programming.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/api/v1")
public class CarController {

    CarService carService = new CarService();

@GetMapping("/new")
    public Car newCar(){
        Car mercedes = new Car();
        mercedes.setColor("Black");
        mercedes.setEnginePower(730);
        mercedes.setName("Mercedes");

        return mercedes;
    }

@GetMapping("/carList")
    public List<Car> getListOfCars(){

    return carService.getCarList();
}

}
