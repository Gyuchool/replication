package com.db.replication;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

}
