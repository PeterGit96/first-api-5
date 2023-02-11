package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public CarDTO getCar() {
        return new CarDTO("F12020", "Ferrari", 2000000.0);
    }

    @PostMapping
    public ResponseEntity<String> postCar(@Valid @RequestBody CarDTO car) {
        car.getDetails();
        return ResponseEntity.status(HttpStatus.CREATED).body("Car created successfully");
    }

}