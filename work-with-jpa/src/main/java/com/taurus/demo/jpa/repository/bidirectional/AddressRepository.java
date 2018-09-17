package com.taurus.demo.jpa.repository.bidirectional;

import com.taurus.demo.jpa.entity.relationship.bidirectional.many2many.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 */
public interface AddressRepository extends JpaRepository<Address,Long> {
}
