package com.inventarios.inventarios.persistence.mapper;

import com.inventarios.inventarios.domain.CategoryDominio;
import com.inventarios.inventarios.persistence.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCaterory", target = "idCateroryD"),
            @Mapping(source = "name", target = "nameD"),
            @Mapping(source = "description", target = "descriptionD"),
    })
    CategoryDominio toCategory(Category category);
}