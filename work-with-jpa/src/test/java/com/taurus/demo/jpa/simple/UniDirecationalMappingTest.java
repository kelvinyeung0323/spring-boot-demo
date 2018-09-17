package com.taurus.demo.jpa.simple;

import com.taurus.demo.jpa.entity.relationship.unidirectional.many2many.Address;
import com.taurus.demo.jpa.entity.relationship.unidirectional.many2many.Person;
import com.taurus.demo.jpa.repository.unidirectional.many2many.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 * 单向映射
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = " spring.profiles.active=simple")
public class UniDirecationalMappingTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void manyToMany(){
        //save
//        Person person= new Person();
//        Address address1 = new Address();
//        address1.setNumber("001");
//        address1.setStreet("street1");
//
//        person.getAddresses().add(address1);
//        personRepository.save(person);

        //remove
        personRepository.deleteById(8L);

    }
}
