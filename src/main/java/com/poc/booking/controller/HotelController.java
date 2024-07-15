package com.poc.booking.controller;

import com.poc.booking.business.hotel.BuscaHotelBusiness;
import com.poc.booking.domain.User;
import com.poc.booking.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {

    @Autowired
    private BuscaHotelBusiness buscaHotelBusiness;

    @GetMapping
    public ResponseEntity<List<User>> findHotels(@RequestParam Long cityId, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkIn,
                                                 @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkout,
                                                 @RequestParam Integer quantityPersons) {
        return ResponseEntity.ok(buscaHotelBusiness.findHotels(cityId, checkIn, checkout, quantityPersons));
    }

}
