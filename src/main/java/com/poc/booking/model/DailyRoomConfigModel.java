package com.poc.booking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "daily_room_config")
@AllArgsConstructor
@NoArgsConstructor
public class DailyRoomConfigModel implements Serializable {

    private static final long serialVersionUID = -4329644525211720779L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private RoomModel room;

    @Column(name = "uavailable_date")
    private LocalDate availableDate;

    @Column(name = "available")
    private Boolean isAvailable;

    @Column(name = "active")
    private Boolean isActive;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "schedule_checkout")
    private Integer scheduleCheckout;

    @Column(name = "schedule_checkin")
    private Integer scheduleCheckin;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
