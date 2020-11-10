package com.smh.testfindbyid.service;

import com.smh.testfindbyid.model.City;
import com.smh.testfindbyid.repository.CityRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class CityServiceImpl implements CityService{

    private final CityRepo cityRepo;

    @Override
    public List<City> findAll() {
        return cityRepo.findAll();
    }

    @Override
    public City findByCityName(String name) {
        return cityRepo.findByName(name);
    }
}
