package com.poc.booking.mapper;

import com.poc.booking.domain.DailyRoomConfig;
import com.poc.booking.domain.Room;
import com.poc.booking.model.DailyRoomConfigModel;
import com.poc.booking.model.RoomModel;
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
public class RoomMapperImpl implements RoomMapper {

    @Autowired
    private DailyRoomMapper dailyRoomMapper;

    @Override
    public Room toDomain(RoomModel ufModel) {
        if ( ufModel == null ) {
            return null;
        }

        Room room = new Room();

        room.setId( ufModel.getId() );
        room.setName( ufModel.getName() );
        room.setDescription( ufModel.getDescription() );
        room.setIsActive( ufModel.getIsActive() );
        room.setDefaultPrice( ufModel.getDefaultPrice() );
        room.setDefaultScheduleCheckout( ufModel.getDefaultScheduleCheckout() );
        room.setDefaultScheduleCheckin( ufModel.getDefaultScheduleCheckin() );
        room.setQuantityPersons( ufModel.getQuantityPersons() );
        room.setCreatedAt( ufModel.getCreatedAt() );
        room.setUpdatedAt( ufModel.getUpdatedAt() );
        room.setDailyRoomConfigs( dailyRoomConfigModelListToDailyRoomConfigList( ufModel.getDailyRoomConfigs() ) );

        return room;
    }

    @Override
    public RoomModel toModel(Room ufDomain) {
        if ( ufDomain == null ) {
            return null;
        }

        RoomModel roomModel = new RoomModel();

        roomModel.setId( ufDomain.getId() );
        roomModel.setName( ufDomain.getName() );
        roomModel.setDescription( ufDomain.getDescription() );
        roomModel.setIsActive( ufDomain.getIsActive() );
        roomModel.setDefaultPrice( ufDomain.getDefaultPrice() );
        roomModel.setDefaultScheduleCheckout( ufDomain.getDefaultScheduleCheckout() );
        roomModel.setDefaultScheduleCheckin( ufDomain.getDefaultScheduleCheckin() );
        roomModel.setQuantityPersons( ufDomain.getQuantityPersons() );
        roomModel.setCreatedAt( ufDomain.getCreatedAt() );
        roomModel.setUpdatedAt( ufDomain.getUpdatedAt() );
        roomModel.setDailyRoomConfigs( dailyRoomConfigListToDailyRoomConfigModelList( ufDomain.getDailyRoomConfigs() ) );

        return roomModel;
    }

    protected List<DailyRoomConfig> dailyRoomConfigModelListToDailyRoomConfigList(List<DailyRoomConfigModel> list) {
        if ( list == null ) {
            return null;
        }

        List<DailyRoomConfig> list1 = new ArrayList<DailyRoomConfig>( list.size() );
        for ( DailyRoomConfigModel dailyRoomConfigModel : list ) {
            list1.add( dailyRoomMapper.toDomain( dailyRoomConfigModel ) );
        }

        return list1;
    }

    protected List<DailyRoomConfigModel> dailyRoomConfigListToDailyRoomConfigModelList(List<DailyRoomConfig> list) {
        if ( list == null ) {
            return null;
        }

        List<DailyRoomConfigModel> list1 = new ArrayList<DailyRoomConfigModel>( list.size() );
        for ( DailyRoomConfig dailyRoomConfig : list ) {
            list1.add( dailyRoomMapper.toModel( dailyRoomConfig ) );
        }

        return list1;
    }
}
