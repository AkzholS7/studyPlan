package com.example.onlinestore2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    private long customerId;

    @Column
    private String firstName;

    @Column
    private String lastName;
}