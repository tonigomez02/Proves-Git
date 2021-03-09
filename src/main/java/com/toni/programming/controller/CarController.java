package com.toni.programming.controller;

import com.toni.programming.data.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/api/v1")
public class CarController {

@GetMapping("/new")
    public Car newCar(){
        Car mercedes = new Car();
        mercedes.setColor("Black");
        mercedes.setEnginePower(730);
        mercedes.setName("Mercedes");

        return mercedes;
    }


}
