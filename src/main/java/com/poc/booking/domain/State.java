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
public class State implements Serializable {

    private static final long serialVersionUID = -5455046264148552016L;
    private Long id;

    private String name;


    private Country country;

    private LocalDateTime createdAt;

}
