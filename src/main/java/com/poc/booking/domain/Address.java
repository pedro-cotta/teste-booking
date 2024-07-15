package com.poc.booking.domain;

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
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {


    private static final long serialVersionUID = -1446303905879079565L;
    private Long id;

    private String street;

    private Integer number;

    private String neighborhood;

    private Integer zipcode;

    private String complement;

    private City city;

    private LocalDateTime createdAt;

}
