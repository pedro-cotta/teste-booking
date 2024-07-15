package com.poc.booking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
public class AddressModel implements Serializable {


    private static final long serialVersionUID = -1446303905879079565L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 50)
    @Column(name = "street")
    private String street;

    @NotNull
    @Column(name = "number")
    private Integer number;

    @NotNull
    @Size(max = 30)
    @Column(name = "neighborhood")
    private String neighborhood;

    @NotNull
    @Column(name = "zipcode")
    private Integer zipcode;

    @Size(max = 100)
    @Column(name = "complement")
    private String complement;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "city_id")
    private CityModel city;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
