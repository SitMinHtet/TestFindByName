package com.smh.testfindbyid.repository;

import com.smh.testfindbyid.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City, Long> {

    @Query("select  c from City c where c.name=:name")
    City findByName(String name);
}
