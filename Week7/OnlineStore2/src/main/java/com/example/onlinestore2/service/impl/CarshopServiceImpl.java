package com.example.onlinestore2.service.impl;

import com.example.onlinestore2.exception.ResourceNotFoundException;
import com.example.onlinestore2.model.Carshop;
import com.example.onlinestore2.repository.CarshopRepository;
import com.example.onlinestore2.service.CarshopService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.List;

@Service
public class CarshopServiceImpl implements CarshopService {
    private CarshopRepository carshopRepository;

    public CarshopServiceImpl(CarshopRepository carshopRepository) {
        this.carshopRepository = carshopRepository;
    }

    @Override
    public Carshop saveCarshop(Carshop carshop) {
        return carshopRepository.save(carshop);
    }

    @Override
    public List<Carshop> getAllCarshop() {
        return carshopRepository.findAll();
    }

    @Override
    public Carshop getCarshopById(long id) {
        return carshopRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Carshop", "Id", id));
    }

    @Override
    public Carshop updateCarshop(Carshop carshop, long id) {
        Carshop existingCarshop = carshopRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Carshop", "Id", id));
        existingCarshop.setModel(carshop.getModel());
        existingCarshop.setProvidedYear(carshop.getProvidedYear());
        carshopRepository.save(existingCarshop);
        return existingCarshop;

    }

    @Override
    public void deleteCarshop(long id) {
        carshopRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Carshop", "Id", id));
        carshopRepository.deleteById(id);
    }


}
