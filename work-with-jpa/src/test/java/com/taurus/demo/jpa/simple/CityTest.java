package com.taurus.demo.jpa.simple;

import com.querydsl.core.types.Predicate;
import com.taurus.demo.jpa.entity.City;
import com.taurus.demo.jpa.entity.QCity;
import com.taurus.demo.jpa.repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
/**
 * Created by Kelvin Yeung on 2018/8/22.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(properties = " spring.profiles.active=simple")
public class CityTest {

    @Autowired
    CityRepository cityRepository;
    @Autowired
    CityCrudRepository cityCrudRepository;
    @Autowired
    CityJpaRepository cityJpaRepository;

    @Autowired
    CityDslRepository cityDslRepository;

    @Autowired
    CitySpecificationRepository citySpecificationRepository;

    @Test
    public void Repository(){
        //Save==================================
//        City city = new City("FoShan","GuanDong");
//        City savedCity = cityRepository.save(city);
//        System.out.print("Repository save city:"+savedCity);


        //find =====================================
//        City city1 = cityRepository.findCityByName("KaiPing");
//        System.out.print("Repository findCityByName:" +city1);

        //Pagable===================================第一页为0页
//        Page<City> page= cityRepository.findAll(PageRequest.of(0,2));
//        System.out.println(page.toString());

        Page<City> page2 = cityRepository.findAll(PageRequest.of(0,3, Sort.by(Sort.Direction.ASC,"name")));
        System.out.println(page2.toString());

        Page<City> page3 = cityRepository.findAll(PageRequest.of(0,2, Sort.by(Sort.Order.asc("name"), Sort.Order.desc("id"))));
        System.out.println(page3.toString());



    }

    @Test
    public void CrudRepository(){
        City city = new City("GuangZhou","GuanDong");
        City savedCity = cityCrudRepository.save(city);
        System.out.print(savedCity);
    }



    @Test
    public void JpaRepository(){
        City city = new City("KaiPing","GuanDong");
        City savedCity = cityJpaRepository.save(city);
        System.out.print(savedCity);

    }


    @Test
    public void querybyExample(){
        //QueryByExample的缺点，除字符串类型外，其他类型只能精确aqn
//        City queryCity = new City("KaiPing","GuanDong");
//        Example<City> example = Example.of(queryCity);
//        List<City> cityList = cityJpaRepository.findAll(example);
//        System.out.print(cityList.toString());

        //==================================================
        City probe = new City();
        probe.setName("Kai");
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("name", matcher -> matcher.contains());
        Example example2 = Example.of(probe,exampleMatcher);
        List<City> cityList2 = cityJpaRepository.findAll(example2);
        System.out.print(cityList2);

    }

    @Test
    public void queryWithDsl(){
        Predicate predicate =  QCity.city.name.contains("Kai").and(QCity.city.state.endsWithIgnoreCase("dong"));
        List<City> cityList = (List<City>) cityDslRepository.findAll(predicate);
        System.out.println(cityList);

    }

    @Test
    public void queryWithSpecification(){
//        Specification<City> spec
//        citySpecificationRepository.findAll();
    }
}
