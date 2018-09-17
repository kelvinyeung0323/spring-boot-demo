package com.taurus.demo.jpa.repository;

import com.taurus.demo.jpa.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kelvin Yeung on 2018/8/22.
 */
public interface CityJpaRepository extends JpaRepository<City,Long> {
}
