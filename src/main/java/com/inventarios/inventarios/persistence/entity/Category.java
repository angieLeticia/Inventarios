package com.inventarios.inventarios.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorys")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_category")
    private Integer idCaterory;
    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> products;


    public Integer getIdCaterory() {
        return idCaterory;
    }

    public void setIdCaterory(Integer idCaterory) {
        this.idCaterory = idCaterory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
