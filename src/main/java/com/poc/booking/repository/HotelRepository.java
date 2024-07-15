package com.poc.booking.repository;

import com.poc.booking.enums.UserTypeEnum;
import com.poc.booking.model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HotelRepository extends CrudRepository<UserModel, Long> {

    @Query("select distinct h FROM UserModel h " +
            "JOIN h.address a " +
            "JOIN h.rooms r " +
            "JOIN r.dailyRoomConfigs d " +
            "WHERE a.city.id = :cityId " +
            "AND r.isActive = true " +
            "AND h.isActive = true " +
            "AND d.isActive = true " +
            "AND h.type =:type " +
            "AND r.quantityPersons >= :quantityPersons " +
            "AND (d.availableDate = :checkIn or d.availableDate = :checkout) ")
    List<UserModel> find(Long cityId, LocalDate checkIn, LocalDate checkout,
                         Integer quantityPersons, UserTypeEnum type);

}
