package com.taurus.demo.jpa.repository;

import com.taurus.demo.jpa.entity.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

/**
 * Created by Kelvin Yeung on 2018/8/22.
 */
public interface CityRepository extends Repository<City,Long> {
    City save(City city);
    City findById(Long id);
    City findCityByName(String name);

    City findByNameAndStateAllIgnoringCase(String name, String country);
    Page<City> findAll(Pageable pageable);

}
