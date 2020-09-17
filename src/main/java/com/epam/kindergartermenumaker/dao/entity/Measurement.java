package com.epam.kindergartermenumaker.dao.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author : Oleksandr Diachenko
 * @since : 9/17/2020
 **/
@Entity
@Table(name = "measurement_unit")
@Getter
@Builder
@EqualsAndHashCode(exclude = "id")
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    private long id;
    @NotNull
    private final String description;
}
