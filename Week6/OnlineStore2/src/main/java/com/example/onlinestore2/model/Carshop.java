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

    @Column
    private String model;

    @Column
    private String provided_year;

    @ManyToOne
            @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
    Customer customer;
}