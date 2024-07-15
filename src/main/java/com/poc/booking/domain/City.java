package com.poc.booking.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City implements Serializable {


    private static final long serialVersionUID = -3812470179144563231L;
    private Long id;

    private String name;

    private State state;

    private LocalDateTime createdAt;
}
