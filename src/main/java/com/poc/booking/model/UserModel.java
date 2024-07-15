package com.poc.booking.model;

import com.poc.booking.enums.UserTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class UserModel implements Serializable {

    private static final long serialVersionUID = -4329644525211720779L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 14)
    @Column(name = "register_number")
    private String registerNumber;

    @NotNull
    @Size(max = 50)
    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private Boolean isActive;

    @ManyToOne(cascade = CascadeType.ALL)
    @NotNull
    @JoinColumn(name = "address_id")
    private AddressModel address;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private UserTypeEnum type;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "hotel")
    private List<RoomModel> rooms;

    public List<LocalDate> getAvailableDates() {
        List<LocalDate> dates = new ArrayList<>();

        if(CollectionUtils.isEmpty(rooms))
            return dates;

        List<List<LocalDate>> available = rooms.stream()
                .map(r -> r.getDailyRoomConfigs().stream().map(c -> c.getAvailableDate()).collect(Collectors.toList()))
                .collect(Collectors.toList());
        available.forEach(a -> dates.addAll(a));

        return  dates;
    }

}
