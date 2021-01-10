
package com.teamthree.event.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "tickets")
@Entity

public class Ticket {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Double price;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    //reference column
    private User user;
}
