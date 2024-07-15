package com.poc.booking.mapper;

import com.poc.booking.domain.DailyRoomConfig;
import com.poc.booking.domain.Room;
import com.poc.booking.model.DailyRoomConfigModel;
import com.poc.booking.model.RoomModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = DailyRoomMapper.class)
public interface RoomMapper {

    Room toDomain(RoomModel ufModel);

    RoomModel toModel(Room ufDomain);

}
