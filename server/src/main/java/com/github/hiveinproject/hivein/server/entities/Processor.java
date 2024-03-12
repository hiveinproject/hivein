package com.github.hiveinproject.hivein.server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Processor extends Hardware {

    @Column
    private String family;

    @Column
    private String model;

    @Column
    private String manufacture;

}