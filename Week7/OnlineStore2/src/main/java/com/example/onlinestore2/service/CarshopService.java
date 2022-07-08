package com.example.onlinestore2.service;

import com.example.onlinestore2.model.Carshop;

import java.util.List;

public interface CarshopService {
    Carshop saveCarshop(Carshop carshop);
    List<Carshop> getAllCarshop();
    Carshop getCarshopById(long id);
    Carshop updateCarshop(Carshop carshop, long id);
    void deleteCarshop(long id);
}
