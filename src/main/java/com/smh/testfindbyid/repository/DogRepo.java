package com.smh.testfindbyid.repository;


import com.smh.testfindbyid.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends JpaRepository<Dog, Long> {

    Dog findByDogName(String name);
}
