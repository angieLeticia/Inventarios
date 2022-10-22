package com.inventarios.inventarios.domain;

import com.inventarios.inventarios.persistence.entity.Product;

import java.util.List;

public class CategoryDominio {
    private Integer idCateroryD;
    private String nameD;
    private String descriptionD;

    public Integer getIdCateroryD() {
        return idCateroryD;
    }

    public void setIdCateroryD(Integer idCateroryD) {
        this.idCateroryD = idCateroryD;
    }

    public String getNameD() {
        return nameD;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public String getDescriptionD() {
        return descriptionD;
    }

    public void setDescriptionD(String descriptionD) {
        this.descriptionD = descriptionD;
    }

    }
