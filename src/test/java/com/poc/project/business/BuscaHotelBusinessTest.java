package com.poc.project.business;

import com.poc.booking.business.hotel.BuscaHotelBusiness;
import com.poc.booking.domain.User;
import com.poc.booking.enums.UserTypeEnum;
import com.poc.booking.mapper.UserMapper;
import com.poc.booking.model.DailyRoomConfigModel;
import com.poc.booking.model.RoomModel;
import com.poc.booking.model.UserModel;
import com.poc.booking.repository.HotelRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BuscaHotelBusinessTest {

    @Mock
    private HotelRepository hotelRepository;

    @Mock
    private UserMapper userMapper;

    @InjectMocks
    private BuscaHotelBusiness buscaHotelBusiness;

    @Test
    public void teste_comRetorno() {
        LocalDate checkin = LocalDate.now();
        LocalDate checkout = LocalDate.now().plusDays(1);
        Long cityId = 1l;
        Integer quantityPerson = 1;

        UserModel user = Mockito.mock(UserModel.class);
        Mockito.when(user.getAvailableDates()).thenReturn(Arrays.asList(checkin, checkout));

        List<UserModel> users = new ArrayList<>();
        users.add(user);

        Mockito.when(hotelRepository.find(cityId, checkin, checkout, quantityPerson, UserTypeEnum.HO)).thenReturn(users);

        Mockito.when(userMapper.toDomain(user)).thenReturn(new User());

        List<User> hotels = buscaHotelBusiness.findHotels(cityId, checkin, checkout, quantityPerson);

        Assert.assertEquals(hotels.size(), 1);

    }

    @Test
    public void teste_naoEncontradoBase() {
        LocalDate checkin = LocalDate.now();
        LocalDate checkout = LocalDate.now().plusDays(1);
        Long cityId = 1l;
        Integer quantityPerson = 1;


        List<User> hotels = buscaHotelBusiness.findHotels(cityId, checkin, checkout, quantityPerson);

        Assert.assertEquals(hotels, null);
    }

    @Test
    public void teste_semDatas() {
        LocalDate checkin = LocalDate.now();
        LocalDate checkout = LocalDate.now().plusDays(1);
        Long cityId = 1l;
        Integer quantityPerson = 1;

        UserModel user = Mockito.mock(UserModel.class);
        Mockito.when(user.getAvailableDates()).thenReturn(Arrays.asList(checkin.plusDays(3), checkout.plusDays(4)));

        List<UserModel> users = new ArrayList<>();
        users.add(user);

        Mockito.when(hotelRepository.find(cityId, checkin, checkout, quantityPerson, UserTypeEnum.HO)).thenReturn(users);

        List<User> hotels = buscaHotelBusiness.findHotels(cityId, checkin, checkout, quantityPerson);

        Assert.assertEquals(hotels, null);

    }

}


