package com.poc.booking.model;

import com.poc.booking.enums.UserTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "room")
@AllArgsConstructor
@NoArgsConstructor
public class RoomModel implements Serializable {

    private static final long serialVersionUID = -4329644525211720779L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_hotel_id")
    private UserModel hotel;

    @NotNull
    @Size(max = 50)
    @Column(name = "name")
    private String name;

    @NotNull
    @Size(max = 150)
    @Column(name = "description")
    private String description;

    @Column(name = "active")
    private Boolean isActive;

    @Column(name = "default_price")
    private BigDecimal defaultPrice;

    @Column(name = "default_schedule_checkout")
    private Integer defaultScheduleCheckout;

    @Column(name = "default_schedule_checkin")
    private Integer defaultScheduleCheckin;

    @Column(name = "quantity_persons")
    private Integer quantityPersons;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "room")
    private List<DailyRoomConfigModel> dailyRoomConfigs;

}
