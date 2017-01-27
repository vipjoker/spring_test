package com.test;


public class Service {
    Repository repository;


    public Integer getResult() {
        return repository.getRandomValue();
    }
}
