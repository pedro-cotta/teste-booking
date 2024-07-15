package com.poc.booking.domain;

import com.poc.booking.enums.UserTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -4329644525211720779L;

    private Long id;

    private String registerNumber;

    private String name;

    private Boolean isActive;

    private Address address;

    private UserTypeEnum type;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private List<Room> rooms;

}
