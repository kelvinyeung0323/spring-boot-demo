package com.taurus.demo.jpa.repository.unidirectional.many2many;

import com.taurus.demo.jpa.entity.relationship.unidirectional.many2many.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

}
