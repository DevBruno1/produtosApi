package com.devbruno.produtosapi.models;

import lombok.*;

///POJO - PLAIN OLD JAVA OBJECT

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    private String id;
    private String name;
    private String description;
    private Double price;

}
