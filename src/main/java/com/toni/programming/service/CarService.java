package com.toni.programming.service;

import com.toni.programming.data.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private static List<Car> carList = new ArrayList<>();
    String[] carColors = {"yellow", "blue", "black", "red"};

    public void initData() {

        for (int i = 0; i < 4; i++) {

            Car car = new Car();
            car.setName("Car " + i);
            car.setEnginePower((int) (Math.random() * 1000));
            car.setColor(carColors[i]);
            car.setModel("Model " + i);
            car.setWheels(4);
            carList.add(car);
        }

    }

    public List<Car> getCarList(){

        if (carList.isEmpty()){
            initData();
            return carList;
        }else {
            return carList;
        }
    }

}
