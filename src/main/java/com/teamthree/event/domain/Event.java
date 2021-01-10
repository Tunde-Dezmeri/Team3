
package com.teamthree.event.domain;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Table(name = "events")
@Entity

public class Event {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private String startTime;
    @Column(nullable = false)
    private String name;
    @Column
    private String description;
    @Column
    private Integer ageLimit;
    @Column(nullable = false)
    private Integer maxTicketNumber;
    @Column(nullable = false)
    private Integer soldTicketNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_type", referencedColumnName = "type")
    private EventType eventType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

}

