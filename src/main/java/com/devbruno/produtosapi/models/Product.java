package com.devbruno.produtosapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

///POJO - PLAIN OLD JAVA OBJECT

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

}
