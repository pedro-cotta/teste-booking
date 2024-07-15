package com.poc.booking.mapper;

import com.poc.booking.domain.DailyRoomConfig;
import com.poc.booking.model.DailyRoomConfigModel;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-15T13:26:48-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_412 (Azul Systems, Inc.)"
)
@Component
public class DailyRoomMapperImpl implements DailyRoomMapper {

    @Override
    public DailyRoomConfig toDomain(DailyRoomConfigModel ufModel) {
        if ( ufModel == null ) {
            return null;
        }

        DailyRoomConfig dailyRoomConfig = new DailyRoomConfig();

        dailyRoomConfig.setId( ufModel.getId() );
        dailyRoomConfig.setAvailableDate( ufModel.getAvailableDate() );
        dailyRoomConfig.setIsAvailable( ufModel.getIsAvailable() );
        dailyRoomConfig.setIsActive( ufModel.getIsActive() );
        dailyRoomConfig.setPrice( ufModel.getPrice() );
        dailyRoomConfig.setScheduleCheckout( ufModel.getScheduleCheckout() );
        dailyRoomConfig.setScheduleCheckin( ufModel.getScheduleCheckin() );
        dailyRoomConfig.setCreatedAt( ufModel.getCreatedAt() );
        dailyRoomConfig.setUpdatedAt( ufModel.getUpdatedAt() );

        return dailyRoomConfig;
    }

    @Override
    public DailyRoomConfigModel toModel(DailyRoomConfig ufDomain) {
        if ( ufDomain == null ) {
            return null;
        }

        DailyRoomConfigModel dailyRoomConfigModel = new DailyRoomConfigModel();

        dailyRoomConfigModel.setId( ufDomain.getId() );
        dailyRoomConfigModel.setAvailableDate( ufDomain.getAvailableDate() );
        dailyRoomConfigModel.setIsAvailable( ufDomain.getIsAvailable() );
        dailyRoomConfigModel.setIsActive( ufDomain.getIsActive() );
        dailyRoomConfigModel.setPrice( ufDomain.getPrice() );
        dailyRoomConfigModel.setScheduleCheckout( ufDomain.getScheduleCheckout() );
        dailyRoomConfigModel.setScheduleCheckin( ufDomain.getScheduleCheckin() );
        dailyRoomConfigModel.setCreatedAt( ufDomain.getCreatedAt() );
        dailyRoomConfigModel.setUpdatedAt( ufDomain.getUpdatedAt() );

        return dailyRoomConfigModel;
    }
}
