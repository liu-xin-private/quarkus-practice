package org.acme.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Cacheable
public class Fruit extends PanacheEntity {

    @Column(length = 40)
    public String name;

    public Fruit() {
    }

    public Fruit(String name) {
        this.name = name;
    }

}