package com.poc.booking.mapper;

import com.poc.booking.domain.Address;
import com.poc.booking.model.AddressModel;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-15T13:25:57-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_412 (Azul Systems, Inc.)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public Address toDomain(AddressModel enderecoModel) {
        if ( enderecoModel == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( enderecoModel.getId() );
        address.setStreet( enderecoModel.getStreet() );
        address.setNumber( enderecoModel.getNumber() );
        address.setNeighborhood( enderecoModel.getNeighborhood() );
        address.setZipcode( enderecoModel.getZipcode() );
        address.setComplement( enderecoModel.getComplement() );
        address.setCity( cityMapper.toDomain( enderecoModel.getCity() ) );
        address.setCreatedAt( enderecoModel.getCreatedAt() );

        return address;
    }

    @Override
    public AddressModel toModel(Address enderecoDomain) {
        if ( enderecoDomain == null ) {
            return null;
        }

        AddressModel addressModel = new AddressModel();

        addressModel.setId( enderecoDomain.getId() );
        addressModel.setStreet( enderecoDomain.getStreet() );
        addressModel.setNumber( enderecoDomain.getNumber() );
        addressModel.setNeighborhood( enderecoDomain.getNeighborhood() );
        addressModel.setZipcode( enderecoDomain.getZipcode() );
        addressModel.setComplement( enderecoDomain.getComplement() );
        addressModel.setCity( cityMapper.toModel( enderecoDomain.getCity() ) );
        addressModel.setCreatedAt( enderecoDomain.getCreatedAt() );

        return addressModel;
    }
}
