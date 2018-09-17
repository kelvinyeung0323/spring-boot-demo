package com.taurus.demo.jpa.simple;

import com.taurus.demo.jpa.entity.relationship.bidirectional.many2many.Address;
import com.taurus.demo.jpa.entity.relationship.bidirectional.many2many.Person;
import com.taurus.demo.jpa.repository.bidirectional.AddressRepository;
import com.taurus.demo.jpa.repository.bidirectional.PersonResporitory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 * 双向映射
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = " spring.profiles.active=simple")
public class BidirecationalMappingTest {

    @Autowired
    private PersonResporitory personResporitory;

    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void manyToMany(){
        //Save
//        Person person = new Person();
//        Address address = new Address();
//        address.setNumber("number1");
//        address.setPostalCode("postCode manyToMany bidirectional 1");
//        address.setStreet("stree manyToMany bidirectional 1");
//        person.getAddresses().add(address);
//
//        personResporitory.save(person);

        //Query1
        List<Person> personList = personResporitory.findAll();
        Address address1 = personList.get(0).getAddresses().get(0);
        System.out.println(personList);

        //Query2
        List<Address> addresses = addressRepository.findAll();
        addresses.get(0).getOwners();
        System.out.println(addresses);



    }
}
