package com.poc.booking.mapper;

import com.poc.booking.domain.Room;
import com.poc.booking.domain.User;
import com.poc.booking.model.RoomModel;
import com.poc.booking.model.UserModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-15T13:25:57-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_412 (Azul Systems, Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public User toDomain(UserModel ufModel) {
        if ( ufModel == null ) {
            return null;
        }

        User user = new User();

        user.setId( ufModel.getId() );
        user.setRegisterNumber( ufModel.getRegisterNumber() );
        user.setName( ufModel.getName() );
        user.setIsActive( ufModel.getIsActive() );
        user.setAddress( addressMapper.toDomain( ufModel.getAddress() ) );
        user.setType( ufModel.getType() );
        user.setCreatedAt( ufModel.getCreatedAt() );
        user.setUpdatedAt( ufModel.getUpdatedAt() );
        user.setRooms( roomModelListToRoomList( ufModel.getRooms() ) );

        return user;
    }

    @Override
    public UserModel toModel(User ufDomain) {
        if ( ufDomain == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setId( ufDomain.getId() );
        userModel.setRegisterNumber( ufDomain.getRegisterNumber() );
        userModel.setName( ufDomain.getName() );
        userModel.setIsActive( ufDomain.getIsActive() );
        userModel.setAddress( addressMapper.toModel( ufDomain.getAddress() ) );
        userModel.setType( ufDomain.getType() );
        userModel.setCreatedAt( ufDomain.getCreatedAt() );
        userModel.setUpdatedAt( ufDomain.getUpdatedAt() );
        userModel.setRooms( roomListToRoomModelList( ufDomain.getRooms() ) );

        return userModel;
    }

    protected List<Room> roomModelListToRoomList(List<RoomModel> list) {
        if ( list == null ) {
            return null;
        }

        List<Room> list1 = new ArrayList<Room>( list.size() );
        for ( RoomModel roomModel : list ) {
            list1.add( roomMapper.toDomain( roomModel ) );
        }

        return list1;
    }

    protected List<RoomModel> roomListToRoomModelList(List<Room> list) {
        if ( list == null ) {
            return null;
        }

        List<RoomModel> list1 = new ArrayList<RoomModel>( list.size() );
        for ( Room room : list ) {
            list1.add( roomMapper.toModel( room ) );
        }

        return list1;
    }
}
