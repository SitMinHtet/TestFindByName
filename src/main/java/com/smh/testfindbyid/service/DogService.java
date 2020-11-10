package com.smh.testfindbyid.service;

import com.smh.testfindbyid.model.Dog;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface DogService {

    Dog addDog(Dog dog);
    void deleteDog(int id, String name);
    List<Dog> rescuedDog(LocalDate rescued);
    long getGeneratedKey(String name, LocalDate rescued, boolean vaccinate);
}
