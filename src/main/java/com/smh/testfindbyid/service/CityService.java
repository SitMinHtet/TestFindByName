package com.smh.testfindbyid.service;

import com.smh.testfindbyid.model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {

    List<City> findAll();
    City findByCityName(String name);
}
