package com.smh.testfindbyid.service;

import com.smh.testfindbyid.model.Dog;
import com.smh.testfindbyid.repository.DogRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Data
public class DogServiceImpl implements DogService{

    private final DogRepo dogRepo;

    @Override
    public Dog addDog(Dog dog) {
        return dogRepo.save(dog);
    }

    @Override
    public void deleteDog(int id, String name) {
    }

    @Override
    public List<Dog> rescuedDog(LocalDate rescued) {
        return null;
    }

    @Override
    public long getGeneratedKey(String name, LocalDate rescued, boolean vaccinate) {
        return 0;
    }
}
