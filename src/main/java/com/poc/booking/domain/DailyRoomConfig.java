package com.poc.booking.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DailyRoomConfig implements Serializable {

    private static final long serialVersionUID = -4329644525211720779L;

    private Long id;

    private LocalDate availableDate;

    private Boolean isAvailable;

    private Boolean isActive;

    private BigDecimal price;

    private Integer scheduleCheckout;

    private Integer scheduleCheckin;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
