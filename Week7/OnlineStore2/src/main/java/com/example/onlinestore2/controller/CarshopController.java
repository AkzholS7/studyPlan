package com.example.onlinestore2.controller;

import com.example.onlinestore2.model.Carshop;
import com.example.onlinestore2.service.CarshopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class CarshopController {
    private CarshopService carshopService;

    public CarshopController(CarshopService carshopService) {
        this.carshopService = carshopService;
    }
    @PostMapping("/api/v1/address")
    public ResponseEntity<Carshop> saveCarshop(@RequestBody Carshop carshop){
        return new ResponseEntity<Carshop>(carshopService.saveCarshop(carshop),HttpStatus.CREATED);
    }

    @GetMapping
    public List<Carshop> getAllCarshop(){
        return carshopService.getAllCarshop();
    }

    @GetMapping("{id}")
    public ResponseEntity<Carshop> getCarshopById(@PathVariable("id") long id){
        return new ResponseEntity<Carshop>(carshopService.getCarshopById(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Carshop> updateCarshop(@PathVariable("id") long id, @RequestBody Carshop carshop){
        return new ResponseEntity<Carshop>(carshopService.updateCarshop(carshop, id), HttpStatus.OK);

    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCarshop(@PathVariable("id") long id){
        carshopService.deleteCarshop(id);
        return new ResponseEntity<String>("Car is successfully deleted", HttpStatus.OK);
    }

}
