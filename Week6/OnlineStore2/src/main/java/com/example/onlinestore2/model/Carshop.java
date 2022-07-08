package com.example.onlinestore2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "car_shop")
public class Carshop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "provided_year", nullable = false)
    private int providedYear;
}