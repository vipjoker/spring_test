package com.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    @InjectMocks
    Service service;

    @Mock
    Repository repository;

    @Before
    public void init(){
        Mockito.when(repository.getRandomValue()).thenReturn(888);
    }

    @Test
    public void testMockito(){
        Mockito.when(repository.getDayOfWeek()).thenReturn("Tuesday");
        String dayOfWeek = repository.getDayOfWeek();
        Assert.assertNotNull(dayOfWeek);
    }


    @Test
    public void testService(){

        Integer result = service.getResult();
        Assert.assertNotNull(result);
    }

}
