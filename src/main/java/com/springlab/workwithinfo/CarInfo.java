package com.springlab.workwithinfo;

import com.springlab.car.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarInfo {
    private static List<Car> carsList = new ArrayList<Car>(Arrays.asList(
            new Car((long)1, "Sl 500", 20000),
            new Car((long)2, "607", 35000),
            new Car((long)3, "KIA", 15000),
            new Car((long)4, "Toyota", 25000)
    ));

    public List<Car> getCarsList() {
        return carsList;
    }

    public void addCar(String model, int price) {
        carsList.add(new Car((long)carsList.size() + 1,model,price));
    }

    public List<Car> findByModel(String model) {
        List<Car> suitableCar = new ArrayList<Car>();
        for(Car car: carsList) {
            if (car.getModel().equals(model)) {
                suitableCar.add(car);
                break;
            }
        }
        return suitableCar;
    }

    public List<Car> findByPrice(int price) {
        List<Car> suitableCars = new ArrayList<Car>();
        for(Car car: carsList) {
            if (car.getPrice() <= price) {
                suitableCars.add(car);
            }
        }

        return suitableCars;
    }
}
