package com.poc.booking.mapper;

import com.poc.booking.domain.Room;
import com.poc.booking.domain.User;
import com.poc.booking.model.RoomModel;
import com.poc.booking.model.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {RoomMapper.class, AddressMapper.class})
public interface UserMapper {

    User toDomain(UserModel ufModel);

    UserModel toModel(User ufDomain);

}
