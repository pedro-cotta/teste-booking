package com.poc.booking.mapper;

import com.poc.booking.domain.City;
import com.poc.booking.model.CityModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = StateMapper.class)
public interface CityMapper {

    City toDomain(CityModel cidadeModel);

    CityModel toModel(City cidadeDomain);

}
