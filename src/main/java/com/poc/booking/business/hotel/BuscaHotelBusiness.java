package com.poc.booking.business.hotel;

import com.poc.booking.domain.User;
import com.poc.booking.enums.UserTypeEnum;
import com.poc.booking.mapper.UserMapper;
import com.poc.booking.model.UserModel;
import com.poc.booking.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class BuscaHotelBusiness {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public List<User> findHotels(Long cityId, LocalDate checkIn, LocalDate checkout,
                                 Integer quantityPersons) {

        List<UserModel> hotels = hotelRepository.find(cityId, checkIn, checkout, quantityPersons, UserTypeEnum.HO);

        long numOfDaysBetween = ChronoUnit.DAYS.between(checkIn, checkout);

        List<LocalDate> datesSearched = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> checkIn.plusDays(i))
                .collect(Collectors.toList());

        if(CollectionUtils.isEmpty(hotels))
            return null;

        Boolean notHavingDayAvailable = datesSearched.stream()
                .filter(date -> hotels.stream().anyMatch(hotel -> !hotel.getAvailableDates().contains(date)))
                .findFirst()
                .isPresent();

        if(notHavingDayAvailable)
            return null;

        return hotels.stream()
                .map(user -> userMapper.toDomain(user))
                .collect(Collectors.toList());
    }
}
