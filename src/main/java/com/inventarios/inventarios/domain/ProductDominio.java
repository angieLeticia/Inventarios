package com.inventarios.inventarios.domain;

import com.inventarios.inventarios.persistence.entity.Category;

public class ProductDominio {

    private  Integer idProductD;
    private Integer idCategoryD;
    private String nameD;
    private String descriptionD;
    private Double priceD;
    private Integer quantityD;
    private CategoryDominio categoryDominio;

    public Integer getIdProductD() {
        return idProductD;
    }

    public void setIdProductD(Integer idProductD) {
        this.idProductD = idProductD;
    }

    public Integer getIdCategoryD() {
        return idCategoryD;
    }

    public void setIdCategoryD(Integer idCategoryD) {
        this.idCategoryD = idCategoryD;
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

    public Double getPriceD() {
        return priceD;
    }

    public void setPriceD(Double priceD) {
        this.priceD = priceD;
    }

    public Integer getQuantityD() {
        return quantityD;
    }

    public void setQuantityD(Integer quantityD) {
        this.quantityD = quantityD;
    }

    public CategoryDominio getCategoryDominio() {
        return categoryDominio;
    }

    public void setCategoryDominio(CategoryDominio categoryDominio) {
        this.categoryDominio = categoryDominio;
    }
}
