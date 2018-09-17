package com.taurus.demo.jpa.entity.relationship.bidirectional.many2many;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 */
@Entity(name = "PersonBidMany2Many")
public class Person {

    @Id
    @GeneratedValue
    private Long id;


    @NaturalId
    private String registrationNumber;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},fetch = FetchType.EAGER)
    private List<Address> addresses = new ArrayList<>();




//    public void addAddress(Address address) {
//        addresses.add( address );
//        address.getOwners().add( this );
//    }
//
//    public void removeAddress(Address address) {
//        addresses.remove( address );
//        address.getOwners().remove( this );
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals( registrationNumber, person.registrationNumber );
    }

    @Override
    public int hashCode() {
        return Objects.hash( registrationNumber );
    }

}
