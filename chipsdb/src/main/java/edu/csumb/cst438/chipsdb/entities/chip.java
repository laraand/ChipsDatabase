package edu.csumb.cst438.chipsdb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chip")
public class chip{

    @Id
    private String id;
    private Brand brand;
    private Flavor flavor;
    private Price value;

    public chip(String id, Brand brand, Flavor flavor,Price value){
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.value = value;
    }

    public String getId(){
        return this.id;

    }

    public Brand getBrand(){
        return this.brand;
    }

    public Flavor getFlavor(){
        return this.flavor;

    }

    public Price getPrice(){
        return this.value;
    }
}