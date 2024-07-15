package com.poc.booking.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room implements Serializable {

    private static final long serialVersionUID = -4329644525211720779L;

    private Long id;

    private String name;

    private String description;

    private Boolean isActive;

    private BigDecimal defaultPrice;

    private Integer defaultScheduleCheckout;

    private Integer defaultScheduleCheckin;

    private Integer quantityPersons;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private List<DailyRoomConfig> dailyRoomConfigs;

}
