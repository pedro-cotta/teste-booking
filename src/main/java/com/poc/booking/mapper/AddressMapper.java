package com.poc.booking.mapper;

import com.poc.booking.domain.Address;
import com.poc.booking.model.AddressModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = CityMapper.class)
public interface AddressMapper {

    Address toDomain(AddressModel enderecoModel);

    AddressModel toModel(Address enderecoDomain);

}
