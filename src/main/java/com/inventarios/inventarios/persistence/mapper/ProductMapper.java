package com.inventarios.inventarios.persistence.mapper;

import com.inventarios.inventarios.domain.ProductDominio;
import com.inventarios.inventarios.persistence.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses ={CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProduct",target = "idProductD"),
            @Mapping(source = "idCategory",target = "idCategoryD"),
            @Mapping(source = "name",target = "nameD"),
            @Mapping(source = "description",target = "descriptionD"),
            @Mapping(source = "price",target = "priceD"),
            @Mapping(source = "quantity",target = "quantityD"),
            @Mapping(source = "category", target = "categoryDominio"),

    })


    ProductDominio toProductD(Product product);

}
