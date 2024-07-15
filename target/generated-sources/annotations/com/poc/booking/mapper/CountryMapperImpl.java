package com.poc.booking.mapper;

import com.poc.booking.domain.Country;
import com.poc.booking.model.CountryModel;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-15T13:25:57-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_412 (Azul Systems, Inc.)"
)
@Component
public class CountryMapperImpl implements CountryMapper {

    @Override
    public Country toDomain(CountryModel ufModel) {
        if ( ufModel == null ) {
            return null;
        }

        Country country = new Country();

        country.setId( ufModel.getId() );
        country.setName( ufModel.getName() );
        country.setCreatedAt( ufModel.getCreatedAt() );

        return country;
    }

    @Override
    public CountryModel toModel(Country ufDomain) {
        if ( ufDomain == null ) {
            return null;
        }

        CountryModel countryModel = new CountryModel();

        countryModel.setId( ufDomain.getId() );
        countryModel.setName( ufDomain.getName() );
        countryModel.setCreatedAt( ufDomain.getCreatedAt() );

        return countryModel;
    }
}
