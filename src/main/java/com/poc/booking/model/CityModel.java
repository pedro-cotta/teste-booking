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
@Table(name = "city")
@AllArgsConstructor
@NoArgsConstructor
public class CityModel implements Serializable {


    private static final long serialVersionUID = -3812470179144563231L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 50)
    @Column(name = "name")
    private String name;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "state_id")
    private StateModel state;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
