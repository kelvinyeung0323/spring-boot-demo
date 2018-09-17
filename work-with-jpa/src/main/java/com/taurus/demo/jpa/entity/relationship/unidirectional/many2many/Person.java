package com.taurus.demo.jpa.entity.relationship.unidirectional.many2many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<Address> addresses = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}


