package com.taurus.demo.jpa.repository;

import com.taurus.demo.jpa.entity.City;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 */
public interface CitySpecificationRepository extends CrudRepository<City,Long>,JpaSpecificationExecutor {
}
