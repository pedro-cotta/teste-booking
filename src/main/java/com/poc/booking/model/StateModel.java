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
@Table(name = "tb_state")
@AllArgsConstructor
@NoArgsConstructor
public class StateModel implements Serializable {

    private static final long serialVersionUID = -5455046264148552016L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 50)
    @Column(name = "name")
    private String name;


    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryModel country;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
