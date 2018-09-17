package com.taurus.demo.jpa.entity.relationship.unidirectional.many2many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 */
@Entity
public class Address {


    @Id
    @GeneratedValue
    private Long Id;

    private String street;


    private String number;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
