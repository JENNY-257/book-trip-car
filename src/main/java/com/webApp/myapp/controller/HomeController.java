package com.webApp.myapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.webApp.myapp.entity.Car;
import com.webApp.myapp.repository.CarRepository;


@RestController
public class HomeController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping("/")
    public String index() {
        return "Welcome to the Spring Boot application!";
    }

    @PostMapping("/save-car")
    public Car saveData(@RequestBody Car car) {
        // Just returning the received object for now
        carRepository.save(car);
        return car;
    }
    @GetMapping("/cars")
    public ResponseEntity<Object> getAllCars() {
        List<Car> cars = carRepository.findAll();
        
        if (cars.isEmpty()) {
            String message = "No cars available in the database.";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        } else {
            return ResponseEntity.ok(cars);
        }
    }
        
        // Retrieve detailed data for a specific car by ID
    @GetMapping("/car/{id}")
        public ResponseEntity<Object> getCarById(@PathVariable Long id) {
            Optional<Car> car = carRepository.findById(id);
    
            if (car.isPresent()) {
                return ResponseEntity.ok(car.get());
            } else {
                String errorMessage = "Car with ID " + id + " not found.";
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(errorMessage);
            }
        }





}
