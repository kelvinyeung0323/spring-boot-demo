package com.taurus.demo.jpa.repository;

import com.taurus.demo.jpa.entity.City;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelvin Yeung on 2018/8/26.
 */
public interface CityDslRepository extends CrudRepository<City,Long>,QuerydslPredicateExecutor<City> {
}
