package com.test;

import java.util.List;

/**
 * Created by oleh on 27.01.17.
 */
public interface Repository {

    String getDayOfWeek();

    List<String> getHolidays();

    Integer getRandomValue();
}
