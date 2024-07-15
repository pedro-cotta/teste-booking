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
public class Country implements Serializable {

    private static final long serialVersionUID = -5455046264148552016L;
    private Long id;

    private String name;

    private LocalDateTime createdAt;

}
