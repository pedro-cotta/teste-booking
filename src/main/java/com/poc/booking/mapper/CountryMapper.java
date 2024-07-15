package com.poc.booking.mapper;

import com.poc.booking.domain.Country;
import com.poc.booking.model.CountryModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    Country toDomain(CountryModel ufModel);

    CountryModel toModel(Country ufDomain);

}
