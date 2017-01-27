package com.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by oleh on 27.01.17.
 */
public class RepositoryImpl implements Repository {
    @Override
    public String getDayOfWeek() {
        return "Monday";
    }

    @Override
    public List<String> getHolidays() {
        return Arrays.asList(new String[]{"New year" , "BrithDay"});
    }

    @Override
    public Integer getRandomValue() {
        return 777;
    }
}
