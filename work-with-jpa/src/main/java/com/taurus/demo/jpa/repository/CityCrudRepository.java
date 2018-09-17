package com.taurus.demo.jpa.repository;

import com.taurus.demo.jpa.entity.City;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelvin Yeung on 2018/8/22.
 */
public interface CityCrudRepository extends CrudRepository<City,Long> {
}
