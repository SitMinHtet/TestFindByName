package com.smh.testfindbyid.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int population;


    public City(){}
    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    /*

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.population;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (this==obj){
            return true;
        }
        if(this==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        final City city= (City) obj;
        if(this.population!= city.population){
            return false;
        }
        if(!Objects.equals(this.name, city.name)){
            return false;
        }
        return Objects.equals(this.id, city.id);
    }


    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append("ID").append("Name").append("Population");
        builder.append(id).append(name).append(population);
        return builder.toString();
    }

     */
}
