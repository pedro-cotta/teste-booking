package com.poc.booking.mapper;

import com.poc.booking.domain.State;
import com.poc.booking.model.StateModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = CountryMapper.class)
public interface StateMapper {

    State toDomain(StateModel ufModel);

    StateModel toModel(State ufDomain);

}
