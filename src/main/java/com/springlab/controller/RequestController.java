package com.springlab.controller;

import com.springlab.car.Car;
import com.springlab.workwithinfo.CarInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RequestController {

    private CarInfo cars = new CarInfo();

    @RequestMapping(value = "/")
    public String getCarsList(Model model) {
        List<Car> carsList = cars.getCarsList();
        model.addAttribute("carsList", carsList);
        return "cars";
    }

    @RequestMapping(value = "/add-new-car", method = RequestMethod.GET)
    public String addNewCarPage() {
        return "addNewCar";
    }

    @RequestMapping(value = "/add-new-car", method = RequestMethod.POST)
    public String addCar(@RequestParam(value = "model") String model, @RequestParam(value = "price") int price) {
        cars.addCar(model, price);
        return "redirect:/";
    }

    @RequestMapping(value = "/find-by-model", method = RequestMethod.GET)
    public String findByModelPage() {
        return "findByModel";
    }

    @RequestMapping(value = "/find-by-model", method = RequestMethod.POST)
    public String findByModel(Model model, @RequestParam(value = "model") String carModel) {
        model.addAttribute("carsList", cars.findByModel(carModel));
        return "searchResult";
    }

    @RequestMapping(value = "/find-by-price", method = RequestMethod.GET)
    public String findByPricePage() {
        return "findByPrice";
    }

    @RequestMapping(value = "/find-by-price", method = RequestMethod.POST)
    public String findByPrice(Model model, @RequestParam(value = "price") int price) {

        model.addAttribute("carsList", cars.findByPrice(price));
        return "searchResult";
    }

    @RequestMapping(value = "/go-to-cars-list", method = RequestMethod.GET)
    public String findByPrice() {
        return "redirect:/";
    }
}
