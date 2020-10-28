package com.experis.candy_manufactory.models;

import javax.persistence.*;

@Entity
public class Candy {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private CandyType candyType;

    @Column
    private double weightPerUnit;

    @Column
    private double costPerUnit;

}
