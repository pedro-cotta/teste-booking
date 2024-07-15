package com.poc.booking.mapper;

import com.poc.booking.domain.DailyRoomConfig;
import com.poc.booking.domain.State;
import com.poc.booking.model.DailyRoomConfigModel;
import com.poc.booking.model.StateModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DailyRoomMapper {

    DailyRoomConfig toDomain(DailyRoomConfigModel ufModel);

    DailyRoomConfigModel toModel(DailyRoomConfig ufDomain);

}
