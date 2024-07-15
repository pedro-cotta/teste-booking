package com.poc.booking.mapper;

import com.poc.booking.domain.City;
import com.poc.booking.model.CityModel;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-15T13:25:57-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_412 (Azul Systems, Inc.)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Autowired
    private StateMapper stateMapper;

    @Override
    public City toDomain(CityModel cidadeModel) {
        if ( cidadeModel == null ) {
            return null;
        }

        City city = new City();

        city.setId( cidadeModel.getId() );
        city.setName( cidadeModel.getName() );
        city.setState( stateMapper.toDomain( cidadeModel.getState() ) );
        city.setCreatedAt( cidadeModel.getCreatedAt() );

        return city;
    }

    @Override
    public CityModel toModel(City cidadeDomain) {
        if ( cidadeDomain == null ) {
            return null;
        }

        CityModel cityModel = new CityModel();

        cityModel.setId( cidadeDomain.getId() );
        cityModel.setName( cidadeDomain.getName() );
        cityModel.setState( stateMapper.toModel( cidadeDomain.getState() ) );
        cityModel.setCreatedAt( cidadeDomain.getCreatedAt() );

        return cityModel;
    }
}
