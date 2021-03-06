
package com.teamthree.event.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity

public class EventType {

    @Id
    @Column(length = 20)
    @Enumerated(value = EnumType.STRING)
    private Type type;
}
