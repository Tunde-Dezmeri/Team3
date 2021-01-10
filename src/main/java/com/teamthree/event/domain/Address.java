
package com.teamthree.event.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "addresses")
@Entity

public class Address {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String streetName;
    @Column(nullable = false)
    private String streetNumber;
}

