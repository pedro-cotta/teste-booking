package com.poc.booking.mapper;

import com.poc.booking.domain.State;
import com.poc.booking.model.StateModel;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-15T13:25:57-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_412 (Azul Systems, Inc.)"
)
@Component
public class StateMapperImpl implements StateMapper {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public State toDomain(StateModel ufModel) {
        if ( ufModel == null ) {
            return null;
        }

        State state = new State();

        state.setId( ufModel.getId() );
        state.setName( ufModel.getName() );
        state.setCountry( countryMapper.toDomain( ufModel.getCountry() ) );
        state.setCreatedAt( ufModel.getCreatedAt() );

        return state;
    }

    @Override
    public StateModel toModel(State ufDomain) {
        if ( ufDomain == null ) {
            return null;
        }

        StateModel stateModel = new StateModel();

        stateModel.setId( ufDomain.getId() );
        stateModel.setName( ufDomain.getName() );
        stateModel.setCountry( countryMapper.toModel( ufDomain.getCountry() ) );
        stateModel.setCreatedAt( ufDomain.getCreatedAt() );

        return stateModel;
    }
}
