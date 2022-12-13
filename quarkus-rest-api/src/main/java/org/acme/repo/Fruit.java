package org.acme.repo;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Cacheable
public class Fruit {

    @Id
    @GeneratedValue
    public Long id;

    @Column(length = 40)
    public String name;

    public Fruit() {
    }

    public Fruit(String name) {
        this.name = name;
    }
}